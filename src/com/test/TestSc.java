package com.test;

import java.util.Scanner;

public class TestSc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=0;
		double sum=0;
		double avg=0;
		String [] arr=new String [5];
		System.out.println("�����룺");
	
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextLine();
			if(arr[i].isEmpty()) {
				//System.out.println("����Ϊ��");
				break;
			}
		}
		for(int i=0;i<5;i++) {
			if(arr[i].isEmpty()) {
				len=i;
				break;
			}
			sum+=Double.parseDouble(arr[i]);
			
		}
		
		avg=sum/len;
		System.out.println("�ܷ�Ϊ��"+sum);
		System.out.println("ƽ����Ϊ��"+avg);
		sc.close();

	}

}
