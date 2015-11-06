/*
 * a Java syntax learning demo
 */
package OutCoding;

public class Main {
	public static void main(String[] argv) {
		
		fun5();
		System.out.println("Exiting...");
	}
	public static void compareAge( IComparable lhs, IComparable rhs) {
		if ( lhs.elderThan(rhs) ) System.out.println("1st is elder than 2nd.");
		else System.out.println("1st is NOT elder than 2nd.");
	}
	//generic version
	public static <T extends IComparable> void compareAgeV2(T lhs, T rhs ) {
		if (lhs.elderThan(rhs)) System.out.println("1st is elder than 2nd.");
		else System.out.println("1st is NOT elder than 2nd.");
	}
	public static void fun1() {
		//generic and inheritance demo
		//error like this, because of abstract class
		//Person p = new Person(22);
		Person p = new Student(22);
		p.debug();
		Person p2 = new Student(23);
		compareAge(p, p2);
		compareAgeV2(p, p2);
	}
	public static void fun2() {
		//hash code demo
		String a = new String("Hel");
		String b = new String("Hel");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.equals(b));
		//ArrayList demo
		java.util.AbstractList<String> list = new java.util.ArrayList<String>();
		list.add(a);
		list.add(b);
	}
	public static void fun3() {
		//inner class using demo
		int[] an = {1, 2, 4, 5 };
		//System.out.println(java.util.Arrays.toString(an));
		//inner class
		class InnerClass {
			public void debug() {
				System.out.println(java.util.Arrays.toString(an)); 	//we can use an as a field
				System.out.println("Seen from inner class InnerClass.");
			}
		}
		InnerClass inner = new InnerClass();
		inner.debug();
	}
	public static void fun4() {
		Iarray<String> arr = new Iarray<String>();
		arr.add("Hello");
		arr.add("world");
		System.out.println(arr.get(0));
	}
	public static void fun5() {
		String[] arr = new String[3];
		arr[0] = new String("Hello");
		arr[1] = new String("world");
		arr[2] = new String("!");
		System.out.println(arr.getClass());
	}
}

interface IComparable {
	boolean elderThan(Object other) ;
}

abstract class Person implements IComparable {
	public Person(int age) {
		_age=age;
	}
	abstract public void debug();
	public boolean elderThan(Object other) {
		if (other instanceof Person 
				&& ((Person) other)._age <= _age ) 
			return true;
		else return false;
	}
	
	private int _age;
}

class Student extends Person {
	public Student( int age) {
		super(age);
	}
	public void debug() {
		System.out.println("Class Student.");
	}
}

class Iarray<T> {
	public Iarray() {
		_arr = new Object[BUFFERSIZE];
		_top = -1;
	}
	public void add(T o) {
		_top++;
		_arr[_top] = (Object)o;
	}
	public T get(int index) {
		if (index <= _top)
			return (T)_arr[index];
		else 
			return null;
	}
 	public static void debug() {
		System.out.println("This is class Iarray<T>");
		//error like this, can not make static reference to non-static T
		//T a;
	}
	private final int BUFFERSIZE = 1024;
	private Object[] _arr;
	private int _top;
}
