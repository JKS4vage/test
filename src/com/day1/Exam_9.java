package com.day1;

import java.util.Scanner;

public class Exam_9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入大于6的偶数:");
		int m=sc.nextInt();
		if(m<=6||m%2!=0) {
		System.out.println("请输入大于6的偶数：");
		}else {
			for(int i=0;i<=m;i++) {
				for(int j=i+1;j<=m;j++) {
					if(isPrime(i)&&isPrime(j)&&m==i+j) {
						System.out.println(m+"="+i+"+"+j+"\t");
					}
				}
				if(i>m) {
					System.out.println("不存在");
				}
			}
//			 for (int i = 0; i <= m; i++) {
//				 for (int j = 0; j <= m; j++) {
//				 if ((isPrime(i))&&(isPrime(j))&&(i+j==m)){
//				 System.out.println(m+"="+i+"+"+j);
//				 } 
//				 } 
//				 }
		}
		sc.close();

		

	}
	public static boolean isPrime(int n) {
		boolean flag=true;
		if(n<2) {
			flag=false;
		}else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
				}
			}
		}
		return flag;
	}
}
