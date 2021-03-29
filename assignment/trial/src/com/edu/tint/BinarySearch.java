package com.edu.tint;
import java.util.ArrayList;

public class BinarySearch 
{
	BinarySearch(ArrayList<Integer> a, int searched)
	{
		int n = a.size();
		int l = 0, mid = 0, search;
		while(l<n)
		{
			mid = (l+n)/2; 
			search = (int)a.get(mid);
			
			if(search == searched)
			{
				System.out.printf("Found at %d", mid+1);
				break;
			}
			else if(searched < search)
				n = mid;
			else
				l = mid;
		}	
	}
}
