package com.day2;

import java.util.Scanner;

/*
 * 5��	������ʵ��Լɪ���Ȧ���⡣ n�����ų�һȦ���ӵ�һ���˿�ʼ��������1��ʼ��������m���˳�Ȧ��ʣ�µ�
�˼�����ʼ��1������ֱ�����е��˶���ȦΪֹ�����ڸ�����n,m����������˵ĳ�Ȧ˳��

 */
public class Exam5 {

	public static void main(String[] args){
	    //��ʾ����������
	    System.out.println("�������������Ϸ����������");
	    Scanner sca=new Scanner(System.in);
	    int m=sca.nextInt();
	    //��ʾ����Ҫ��Ȧ����ֵ
	    System.out.println("������Ҫ��Ȧ����ֵ��");        
	    int n=sca.nextInt();
	    System.out.println("����Ȧ�Ĵ��������ţ�");        
	    //������m��ֵ������
	    int[] a=new int[m];
	    //��ʼ���ȣ��Ժ��Ȧһ�������Ⱦͼ�һ
	    int len=m;
	    //�����鸳ֵ
	    for(int i=0;i<a.length;i++)
	        a[i]=i+1;
	    //iΪԪ���±�j����ǰҪ������
	    int i=0;
	    int j=1;
	    while(len>0){
	        if(a[i%m]>0){
	            if(j%n==0){//�ҵ�Ҫ��Ȧ���ˣ�����Ȧ��������һ
	                System.out.print(a[i%m]+"  ");
	                a[i%m]=-1;
	                j=1;
	                i++;
	                len--;
	            }else{
	                i++;
	                j++;
	            }
	        }else{//������λ�ˣ���������һλ����j����һ��Ҳ�������λ��û�б���
	            i++;
	        }
	    }
	    sca.close();
	}
}