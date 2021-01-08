package com.day1;

import java.util.Scanner;

public class Pyramid_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要打印的行数：");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
