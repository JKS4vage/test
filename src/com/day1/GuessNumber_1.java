package com.day1;

import java.util.Scanner;

public class GuessNumber_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=(int)(Math.random()*100+1);
		//System.out.println("�����Ϊ��"+num);
		for(int i=0;i<7;i++) {
			System.out.println("���������֣�");
			int temp=sc.nextInt();
			System.out.println("���������֣�");
			if(temp<num) {
				System.out.println("̫С�ˣ��ٴ�һ�㣡");
			}else if(temp>num){
				System.out.println("̫���ˣ���Сһ�㣡");
			}else {
				System.out.println("��ϲ��¶��ˣ�");
				break;
			}
			if(i==6) {
				System.out.println("��̫���ˣ��´������ɣ�");
			}
		}
		sc.close();
	}
}
