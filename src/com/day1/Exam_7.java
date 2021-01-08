package com.day1;

public class Exam_7 {
	public static void main(String[] args) {
		for(int i=2;i<=5000;i++) {
			if(i==yinShuSum(i)) {
				System.out.print(i+"\t");
			}
			
		}
	}
	public static int yinShuSum(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
}
