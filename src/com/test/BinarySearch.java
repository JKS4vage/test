package com.test;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int [] a= {5,8,12,15,18,20,26,30};
		//int [] b=new int [8];
		int value=26;
        Arrays.sort(a); //���ַ�����֮ǰ��һ��Ҫ������Ԫ������
        System.out.println(Arrays.toString(a));
		System.out.println("���ҵ�"+value+"�����������Ϊ��"+arraySearch(a,value));
	}
	public static int arraySearch(int [] arr ,int value) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int middle=(low+high)/2;
			if(value==arr[middle]) {
				return middle;
			}
			if(value<middle) {
				high=middle-1;
			}
			if(value>middle) {
				low=middle+1;
			}
		}
		return -1;
	}
}
