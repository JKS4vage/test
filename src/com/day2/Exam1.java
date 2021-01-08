package com.day2;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr =new int [10];
		System.out.println("ÇëÊäÈë10 ¸öÊı£º");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("ÉıĞòÊä³ö");
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("½µĞòÊä³ö");
		bubbleSort2(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
		
	}
	//ÉıĞòÅÅĞò
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
	
	//½µĞòÅÅĞò
	public static void bubbleSort2(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
