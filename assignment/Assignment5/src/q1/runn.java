package q1;

public class runn {
	public static void main(String args[])
	{
		//work(id, initial_priority, increment)
		work ob = new work(1, 2, 1);
		work ob1 = new work(2, 1, 2);
		work ob2 = new work(3, 4, 2);
		work ob3 = new work(4, 3, 1);
		
		ob.t.start();
		ob1.t.start();
		ob2.t.start();
		ob3.t.start();
	}
}
