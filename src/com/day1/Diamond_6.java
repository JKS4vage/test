package com.day1;

import java.util.Scanner;

public class Diamond_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要打印的行数：");
		int n=sc.nextInt();
		while(n%2==0) {
			System.out.println("输入错误，请输入奇数！");
			n=sc.nextInt();
		}
		
		for(int i=0;i<=n/2;i++) {
			for(int j=0;j<=n/2-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<=i+1;j++) {
				System.out.print(" ");	
			}
			
			for(int k=0;k<(n/2-i-1)*2+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
