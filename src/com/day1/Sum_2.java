package com.day1;

public class Sum_2 {
	public static void main(String[] args) {
		int sum1=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum1+=i;
			}
		}
		System.out.println("forѭ��ʵ��1-100�ڵ�ż����--------->");
		System.out.println(sum1);
		
		int j=1;
		int sum2=0;
		while(j<=100) {
			if(j%2==0) {
				sum2+=j;
			}
			j++;
		}
			
		System.out.println("whileѭ��ʵ��1-100�ڵ�ż����------->");
		System.out.println(sum2);
		
		int k=1;
		int sum3=0;
		do {
			if(k%2==0) {
				sum3+=k;
			}
			k++;
		}while(k<=100);
		System.out.println("do-whileѭ��ʵ��1-100�ڵ�ż����---->");
		System.out.println(sum3);
		
	}
	
		
}
