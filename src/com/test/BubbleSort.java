package com.test;

public class BubbleSort {

	public static void main(String[] args) {
		int [] a= {6,9,2,16,7,25,3};
		bubbleSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static void bubbleSort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
