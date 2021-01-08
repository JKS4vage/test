package com.day1;

import java.util.Scanner;

public class Exam_12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int grade=0;
		grade=sc.nextInt();
		if(grade==100) {
			System.out.println("A级");
		}else if(grade>=90&&grade<100) {
			System.out.println("A级");
		}else if(grade>=80&&grade<90) {
			System.out.println("B级");
		}else if(grade>=70&&grade<80) {
			System.out.println("C级");
		}else if(grade>=60&&grade<70) {
			System.out.println("D级");
		}else {
			System.out.println("不及格");
		}
		
		sc.close();
	}
}
