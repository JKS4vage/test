package com.test;

public class SequentialSearch {

	public static void main(String[] args) {
		int key =10;
		int [] a={1,2,4,6,9,35,23,56,34,89,100};
		if(sequentialSearch(key, a)>-1) {
			System.out.println("在数组下标"+sequentialSearch(key, a));
			
		}else {
			System.out.println("没有找到");
		}
	}
	
	public static int sequentialSearch(int key, int [] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
