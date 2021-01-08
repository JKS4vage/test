package com.test;

public class Array2Sum {
	public static void main(String[] args) {
		int [][] a= {{2,3,4},{2,3,4,1},{2,3,4,0}};
		int sum =getSum(a);
		System.out.println("ºÍÎª£º"+sum);
	}
	
	public static int getSum(int [][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
}
