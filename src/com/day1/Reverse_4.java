package com.day1;import java.util.Scanner;



public class Reverse_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("请输入一个数：");
		num=sc.nextInt();
		int temp =0;
		while(num>0) {
			if(temp>0||num%10!=0){
				System.out.print(num%10);	
			}
			temp=num%10;
			num=num/10;
		}
	}
}
