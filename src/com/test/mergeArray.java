package com.test;

import java.util.Random;

public class mergeArray {
	public static void main(String[] args) {
		int [] a=new int [5];
		int [] b=new int [5];
		int [] c=new int[a.length+b.length];
		//给数组元素赋随机值
		for(int i=0;i<a.length;i++) {
			a[i]=new Random().nextInt(6)+5;
		}
		for(int i=0;i<b.length;i++) {
			b[i]=new Random().nextInt(6)+5;
		}
		//打印数组
		System.out.println("a数组：");
		for(int each : a) {
			System.out.print(each+" ");
		}
		System.out.println();
		System.out.println("b数组：");
		for(int each : b) {
			System.out.print(each+" ");
		}
		System.out.println();
		//合并数组
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, a.length);
		
		//打印合并后的shuzu
		System.out.println("合并后的c数组：");
		for(int each : c) {
			System.out.print(each+" ");
		}
		
		
	}
}
