package q1;

public class work extends Thread{
	public Thread t;
	public int increment, id;
	
	public work(int id, int priority, int increment) {
		this.t = new Thread(this);
		this.t.setPriority(priority);
		this.increment = increment;
		this.id = id;
	}
	
	@Override
	synchronized public void run() {
		int c = 0;
		long process_running_time = System.currentTimeMillis();
		long initial_time_counter = System.currentTimeMillis();
		long initial_time_priority = System.currentTimeMillis();
		//running each thread for 100ms
		while(System.currentTimeMillis() - process_running_time < 100)
		{
			//printing counter after 10ms
			while(System.currentTimeMillis() - initial_time_counter < 10)
			{
				c++;
			}
			System.out.println(id+"=>\npriority "+t.getPriority()+"\ncounter "+c+"\n");
			initial_time_counter = System.currentTimeMillis();
			
			//updating priority after 30ms
			if(System.currentTimeMillis() - initial_time_priority > 30)
			{
				t.setPriority(t.getPriority() + increment);
				initial_time_priority = System.currentTimeMillis();
			}
		}
	}
}
