package com.day1;

public class Exam_10 {

	public static void main(String[] args) {
		
		//����һ������Ϊ10���������ڴ�������е���
		int[] arr = new int[10];
		//�ȶ��������еĵ�һ���͵ڶ�����
		arr[0] = 1;
		arr[1] = 1;
		//����һ��forѭ������ӡ�����е�Ԫ��
		for(int i = 0;i < arr.length;i++) {
			//�жϣ�����ӡ��������ǰ��������������ֵ
			if(i > 1) {
				arr[i] = arr[i - 2] + arr[i - 1];
			}
			System.out.print(arr[i] + "\t");
		}
		

	}
}
