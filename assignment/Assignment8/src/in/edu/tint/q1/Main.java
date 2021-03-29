package in.edu.tint.q1;

public class Main {

	public static void main(String[] args) {
		Singleton ob1, ob2, ob3;
		ob1 = Singleton.getInstance();
		ob2 = Singleton.getInstance();
		System.out.println(ob1+"\n"+ob2);
		
		ob1.del();
		ob2.del();
		
		ob3 = Singleton.getInstance();
		System.out.println(ob3);
	}

}
