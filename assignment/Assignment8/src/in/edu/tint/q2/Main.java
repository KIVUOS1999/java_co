package in.edu.tint.q2;

public class Main {
	public static void main(String ... args)
	{
		Singleton ob1 = Singleton.getInstance();
		
		Singleton ob2 = Singleton.getInstance();
		System.out.println(ob1);
		System.out.println(ob2);
		Singleton ob3 = Singleton.getInstance();
		System.out.println(ob3);
		Singleton ob4 = Singleton.getInstance();
		System.out.println(ob4);
		Singleton ob5 = Singleton.getInstance();
		System.out.println(ob5);
		Singleton ob6 = Singleton.getInstance();
		System.out.println(ob6);
		ob1.del();
		ob2.del();
		ob1 = Singleton.getInstance();
		System.out.println(ob1);
		ob2 = Singleton.getInstance();
		System.out.println(ob2);
		ob3 = Singleton.getInstance();
	}
}
