package com.test;

public class GetMax {
	public static void main(String[] args) {
		int [] num= {3,24,9,25,45,12};
		int max=getMax(num);
		System.out.println("最大值为："+max);
	}
	
	public static int getMax(int [] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
}
