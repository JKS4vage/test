package com.test;

import java.util.Random;

public class mergeArray {
	public static void main(String[] args) {
		int [] a=new int [5];
		int [] b=new int [5];
		int [] c=new int[a.length+b.length];
		//������Ԫ�ظ����ֵ
		for(int i=0;i<a.length;i++) {
			a[i]=new Random().nextInt(6)+5;
		}
		for(int i=0;i<b.length;i++) {
			b[i]=new Random().nextInt(6)+5;
		}
		//��ӡ����
		System.out.println("a���飺");
		for(int each : a) {
			System.out.print(each+" ");
		}
		System.out.println();
		System.out.println("b���飺");
		for(int each : b) {
			System.out.print(each+" ");
		}
		System.out.println();
		//�ϲ�����
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, a.length);
		
		//��ӡ�ϲ����shuzu
		System.out.println("�ϲ����c���飺");
		for(int each : c) {
			System.out.print(each+" ");
		}
		
		
	}
}
