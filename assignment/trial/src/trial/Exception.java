package trial;

public class Exception {
	private int main_amount = 1000;
	
	public void increaseBalance(int amount)
	{
		this.main_amount += amount;
	}
	
	public void decreaseBalance(int amount)
	{
		try
		{
			if(main_amount - amount < 0)
				throw new ArithmeticException("Insufficient balance");
			this.main_amount -= amount;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
	
	public int getBalance()
	{
		return main_amount;
	}
}