package com.edu.tint.cse.q91;

public class ContiniousSubArray {
	int[][] arr = new int[100][100];// define a array of array

	void add_element(int[][] a) {
		this.arr = a;
	}

	int[] find(int search) {
		for (int[] i : arr) {
			int sum = 0;
			for (int j : i) {
				sum += j;// storing sum of an array
			}
			if (sum == search) {
				return i;// returning the sub-array whose sum is equal to search
			}
		}
		return (new int[0]);// if not found returning empty array
	}

}
