package com.day1;

public class Exam_10 {

	public static void main(String[] args) {
		
		//建立一个长度为10的数组用于存放数列中的数
		int[] arr = new int[10];
		//先定义数列中的第一个和第二个数
		arr[0] = 1;
		arr[1] = 1;
		//建立一个for循环，打印数组中的元素
		for(int i = 0;i < arr.length;i++) {
			//判断：当打印第三个数前，给第三个数赋值
			if(i > 1) {
				arr[i] = arr[i - 2] + arr[i - 1];
			}
			System.out.print(arr[i] + "\t");
		}
		

	}
}
