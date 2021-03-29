package com.edu.tint.cse.q91;
public class Main {
	public static void main(String args[])
	{
		int[][] arr = new int[][] {{1,2,3},{4,5}};
		ContiniousSubArray ob = new ContiniousSubArray();
		ob.add_element(arr);
		
		int[] arr1 = ob.find(9
				);
		if(arr1.length == 0)
			System.out.println("No subarray");
		else
		{
			System.out.print("Array is: ");
			for(int i: arr1)
			{
				System.out.print(i + " ");
			}
		}
	}
}
