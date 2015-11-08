package InCoding;
import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest {
	public static void classAnalyzer() {
		try {
			String name = "SyntaxLearning";
			Class  cl = Class.forName(name);
			Class fcl = cl.getSuperclass();
			
			System.out.println("Modifier of this calss:" + Modifier.toString(cl.getModifiers()));
			System.out.println("Modifier of superClass:" + Modifier.toString(fcl.getModifiers()));
			printConstructors( cl );
			printMethods( cl );
			printFields( cl );
		}catch (Exception e) {
			System.out.println("Class Not Found!");
		}
		finally {
			System.out.println("END try.");
		}
	}
	//the following 3 funs provide ability to analysis class
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getConstructors();
		for ( Constructor con : constructors)
			System.out.println(con.toString());
	}
	public static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		for ( Method meth : methods )
			System.out.println(meth.toString());
	}
	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		for ( Field ele : fields )
			System.out.println(ele.toString());
	}
	public static void objectAnalyzer(Object obj) {
		Class cl = obj.getClass();
		List<Class> cls = new ArrayList<Class>();
		do {
			cls.add(cl);
			System.out.println("An object of class" + cl.getName());
			Field[] fields = cl.getDeclaredFields();
			for ( Field ele : fields) {
				String line = new String();
				line += ele.getType().getName();
				line += ":";			
				line += ele.getName();
				line += "=";
				AccessibleObject.setAccessible(fields, true);
				try {
					line += ele.get(obj);
				}catch (Exception e) {
					System.out.println("Exception occured!");
				}
				System.out.println(line);
				cl = cl.getSuperclass();
			}
		}while (!cls.contains(cl));
	}
	public static <T> T[] arrayGrow(T[] rhs) {
		Class cl = rhs.getClass();
		Class componentType = cl.getComponentType();
		int length = rhs.length;
		//lhs is an reference of Object
		Object lhs = Array.newInstance(componentType, length * 11 /10 +10);
		System.arraycopy(rhs, 0, lhs, 0, length);
		return (T[])lhs;
	}
}
