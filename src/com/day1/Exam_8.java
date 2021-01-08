package com.day1;

public class Exam_8 {

	public static void main(String[] args) {
		double a=0;
		int flag=1;
		for(int i=1;i<10000;i=i+2) {
			
			a+=(double)flag/i;
			flag=-flag;
		}
		a*=4;
		System.out.println("Π的值约为："+a);
		//System.out.println((double)(3/20));
	}

}
