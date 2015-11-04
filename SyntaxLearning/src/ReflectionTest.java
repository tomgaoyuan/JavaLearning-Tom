import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest {
	public static void work() {
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
}
