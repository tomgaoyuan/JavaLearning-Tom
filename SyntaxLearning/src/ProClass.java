/*
 * a class under same package, thus its public/default methods are able to be called
 */
public class ProClass {
	//protected void debug() {
	void debug() {
		System.out.println("Class ProClass");
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