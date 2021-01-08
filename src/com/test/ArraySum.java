package com.test;

public class ArraySum {
	public static void main(String[] args) {
		int [] a=new int [] {1,2,4,6,9};
		System.out.println("数组和为："+getSum(a));
	}
	
	public static int getSum(int [] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
