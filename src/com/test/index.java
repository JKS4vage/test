package com.test;

import java.util.Random;
import java.util.Scanner;

public class index {
	public static int randomNum(){
		int max=9999;
		int min=1000;
		int cardNum;
		cardNum=new Random().nextInt(max-min+1)+min;
		return cardNum;
		
	}
	public static void main(String[] args) {
		int num;
		String action;
		String name = null;
		String password = null;
		int luckNum []=new int [5];
		int cardNum = 0 ;
		String getName;
		String getPassword;
		boolean flag=false;
		do {
			System.out.println("******��ӭ���뽱�͸���ϵͳ******");
			System.out.println("\t1.ע��");
			System.out.println("\t2.��¼");
			System.out.println("\t3.�齱");
			System.out.println("*******************************");
			System.out.println();
			System.out.println("��ѡ��˵���");
			Scanner sc =new Scanner(System.in);
			num=sc.nextInt();
			switch(num){
			case 1:
				System.out.println("[���͸���ϵͳ> ע��]");
				System.out.println("����д����ע����Ϣ��");
				System.out.print("�û�����");
				name=sc.next();
				//System.out.println();
				System.out.print("����:");
				password=sc.next();
				System.out.println("ע��ɹ�����Ǻ����Ļ�Ա����");
				System.out.println("�û���\t"+"����\t"+"��Ա����");
				cardNum=randomNum();
				System.out.println(name+"\t"+password+"\t"+cardNum);
				flag=true;
;				break;
			case 2:
				System.out.println("[���͸���ϵͳ> ��¼]");
				if(!flag) {
					System.out.println("����û��ע��");
					break;
				}
				for(int i=2;i>=0;i--) {
				System.out.println("�������û�����");
				getName=sc.next();
				System.out.println("���������룺");
				getPassword=sc.next();
				if(name.equals(getName)&&password.equals(getPassword)) {
					System.out.println("��ӭ����"+getName);
					break;
				}else {
					System.out.println("�û����������������"+i+"�λ���");
				}
				}
				break;
				
			case 3:
				if(!flag) {
					System.out.println("���ȵ�¼");
					break;
				}
				System.out.println("[���͸���ϵͳ> �齱]");
				System.out.print("���������Ŀ��ţ�");
//				int temp=sc.nextInt();
				while(cardNum!=sc.nextInt()) {
					System.out.println("������Ŀ��Ŵ���,��������");
				}
//				if(cardNum!=temp) {
//					System.out.println("������Ŀ��Ŵ���,ϵͳ�˳�");
//					break;
//					
//				}
				System.out.print("���յ���������Ϊ��");
				for(int i=0;i<5;i++) {
					luckNum[i]=randomNum();
					System.out.print(luckNum[i]+"\t");
				}
				System.out.println();
				for(int i=0;i<luckNum.length;i++) {
					//System.out.println("��"+i);
					if(luckNum[i]==cardNum) {
						System.out.println("��ϲ����Ϊ�������˻�Ա!");
						break;
					}
					if(i==luckNum.length-1) {
						System.out.println("��Ǹ�������Ǳ������˻�Ա!");
					}
				}
				break;
			default:
				System.out.println("������������");
			}
			System.out.println("������(y/n):");
			action=sc.next();
			
		}while(action.equals("y"));
		System.out.println("ϵͳ�˳���ллʹ��");
	

	}
}
