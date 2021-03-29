package q2;

public class userRequest extends Thread{
	Thread t;
	int id;
	printer p;
	
	public userRequest(int request_id, printer pref)
	{
		this.id = request_id;
		t = new Thread(this);
		this.p = pref;
	}
	
	public void run()
	{
		p.print(id);
	}
}
