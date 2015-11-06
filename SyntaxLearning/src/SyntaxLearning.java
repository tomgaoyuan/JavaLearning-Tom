/*
 * Java syntax learning
 */
import java.io.PrintWriter;
import java.util.*;
import OutCoding.*;
public class SyntaxLearning {

	public static void main(String[] argv)
	{
		//fun1();
		//fun2();
		//fun3();
		//fun4();
		//fun5();
		//fun6();
		//fun7();
		//fun8();
		//fun9();
		//fun10();
		//fun11();
		//fun12();
		//fun13();
		//fun14();
		//ReflectionTest.classAnalyzer();
		//using package OutCoding
		//Main.fun7();
		ReflectionTest.objectAnalyzer(new Manager("tom","CTO"));
		System.out.println("Done!");
	}
	private static void fun1() {
		//basic type
				float x = 2.0f; 	//type float
				System.out.println(Math.sqrt(x));
				int[] a = { 1, 2, 3};		//type int
				System.out.println(a.length);
				final String s="This is a string"; 
				System.out.println(s);
				Size cloth = Size.M;
				System.out.println(cloth);
				String s1 = "Hel";
				String s2 = s1;
				String s3 = "HelloWorld";
				if ( s1 == s2 ) System.out.println("EQUAL@1");
				if ( s1 == s3.substring(0, 3)) System.out.println("EQUAL@2");
				if ( s1.equals( s3.substring(0, 3) ) ) System.out.println("EQUAL@3");		
	}
	private static void fun2() {
		//input & output
		java.util.Scanner in = new java.util.Scanner( System.in );
		System.out.println("Please input a line->");
		String s = in.nextLine();
		System.out.println(s);
		in.close();
		try {
			PrintWriter out = new PrintWriter("data.txt");
			out.println("This is a test’‚ «≤‚ ‘");
			out.close();
		}
		catch (Exception e) {
			
		}		
	}
	private static void fun3() {
		//array  
		int[] a = new int [10];
		int[] b = a;
		b[9] = 1;
		for (int ele : a ) System.out.println(ele);
		//2-D array
		int[][] c = new int[10][];
		for (int i = 0; i<10; i++) c[i] = new int[20];
		c[9][19] = 1;		
	}
	private static void fun4() {
		//base class
		Employer e = new Employer("Tom");
		e.debug();
		//Manager m = new Manager("Tom", "Finance");
		Employer m = new Manager("Tom", "Finance");
		m.debug();
		ProClass p = new ProClass();
		p.debug();
	}
	private static void fun5() {
		Manager boss = new Manager("Bill", "CTO") {
			public void debug() {
				System.out.println("Object of class boss");
			}
		};
		boss.debug();
	}
	private static void fun6() {
		java.util.ArrayList<Comparable<Integer>> arr = new java.util.ArrayList<Comparable<Integer>>();
		arr.add(new Integer(1));
		arr.add(new Integer(2));
		arr.add(new Integer(3));
		
		ArrayAlg<Integer> maxmin = new ArrayAlg<Integer>();
		ArrayAlg<Integer>.Pair res = maxmin.maxmin(arr);
		System.out.println(res.getMax());
		System.out.println(res.getMin());
		
	}
	private static void fun7() {
		String s = new String("java.lang.String");
		try {
			Class i = Class.forName(s);
			Object m = i.newInstance();
			System.out.println(m.getClass().getName());
		}catch (Exception e) {
			System.out.println("Class Not Found!");
		}
		
	}
	private static void fun8() {
		class Inner{
			public <T> T getMiddle(T[] a) {
				return a[a.length/2];
			}
		}
		Inner inner = new Inner();
		//String[] a = {"1", "2", "3"};
		Integer[] a = {1, 2, 3};
		//error like this:
		//int a = {1, 2, 3};
		System.out.println(inner.getMiddle(a));
		
	}
	private static void fun9() {
		//Inner class extends class Object
		Object  inner = new Object() {
			public String toString() {
				return new String("Object of Inner class");
			}
		};
		System.out.println(inner.toString());
	}
	private static void fun10() {
		//Dynamic binding
		Employer e =new Manager("Tom","Manager");
		e.debug();  //Dynamic binding
		e.debugForBase();
		
		Employer[] a = { new Employer("Tom"), new Employer("Alen") };
		a[0].debug();

	}
	private static void fun11() {
		//generic
		Integer a[] = {1, 2, 3, 4};
		ArrayAlg<Integer> arr = new ArrayAlg<Integer>();
		arr.makeArray(a);
	}
	private static void fun12() {
		//LinkedList demo
		//LinkedList<String> l = new LinkedList<String>();
		List<String> l = new LinkedList<String>();
		l.add("Bob");
		l.add("Tom");
		l.add("Alice");
		//Iterator<String> i = l.iterator();
		ListIterator<String> i = l.listIterator();
		while(i.hasNext()) 
			System.out.println(i.next());
	}
	private static void fun13() {
		//Map demo
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Bob");
		m.put(2, "Tom");
		m.put(3, "Alice");
		for(Map.Entry<Integer, String> e : m.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		if (m.containsKey(4))
			System.out.println("Contained!");
		else 
			System.out.println("NOT Contained!");
	}
	private static void fun14() {
		//Set demo
		Set<String> s = new HashSet<String>();
		s.add("Bob");
		s.add("Tom");
		s.add("Alice");
		Iterator<String> i = s.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		if (s.contains("Tom"))
			System.out.println("Contained!");
		else 
			System.out.println("NOT Contained!");
	}
}
enum Size { S, M, L};
class Employer {
	public Employer(String s) {
		_name =new String(s);
	}
	private String _name;
	public void debug() {
		System.out.println("Object of class Employer");
	}
	public void debugForBase() {
		System.out.println("Object of class Employer");
	}
}
class Manager extends Employer {
	public Manager(String s, String pos) {
		super(s);
		_position = new String(pos);
	}
	public void debug() {
		System.out.println("Object of class Manager");
	}
	private String _position;
}
class ArrayAlg<T> {
	public Pair maxmin(java.util.ArrayList<Comparable<T>> arr ) {
		T max, min;
		max = min = (T) arr.get(0);
		for (int i = 1; i<arr.size(); i++) {
			if (arr.get(i).compareTo(max) > 0  )
				max = (T) arr.get(i);
			if (arr.get(i).compareTo(min) < 0 )
				min = (T) arr.get(i);
		}
		return new Pair(max, min);
	}
	class Pair {
		public Pair(T max,  T min) {
			_max = max;
			_min = min;
		}
		public T getMax() {
			return _max;
		}
		public T getMin() {
			return _min;
		}
		private T _max;
		private T _min;
	}
	public void makeArray(T[] a) {
		//Can not make T[]
		Object[] p = new Object[a.length];
		for(int i=0; i<a.length; i++)
			p[i] = (Object) a[i];
		for(Object e : p)
			System.out.println((T)e);
	}
}