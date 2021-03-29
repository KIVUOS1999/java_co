package in.edu.tint.q1;

public class Singleton {
	private static Singleton obj = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance()
	{
		if(obj == null)
			obj = new Singleton();
		return obj;
	}
	public void del() {
		obj = null;
	}
}
