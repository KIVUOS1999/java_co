package q2;

public class runn {

	public static void main(String[] args) {
		printer print = new printer();
		userRequest ob = new userRequest(1, print);
		userRequest ob1 = new userRequest(2, print);
		userRequest ob2 = new userRequest(3, print);
		userRequest ob3 = new userRequest(4, print);
		
		ob.start();
		ob1.start();
		ob2.start();
		ob3.start();
	}
}
