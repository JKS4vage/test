package com.dvd;
//��ʱ����ɾ��
import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String action;
		String [] name=new String [7];//�洢DVD����
		int [] state =new int [7];//�洢DVD���״̬��0�ѽ����1�ɽ�
		int [] data =new int [7];//�洢DVD�������
		int [] count =new int [7];//�洢DVD�������
		
		
		name[0]="�������";
		name[1]="�������";
		name[2]="��������";
		state[0]=0;
		state[1]=1;
		state[2]=1;
		data[0]=1;
		data[1]=0;
		data[2]=0;
		count[0]=15;
		count[1]=12;
		count[2]=30;
		
		
		
		
		System.out.println("��ӭʹ������DVD������");
		System.out.println("-------------------------------");
		System.out.println("1.����DVD");
		System.out.println("2.�鿴DVD");
		System.out.println("3.ɾ��DVD");
		System.out.println("4.���DVD");
		System.out.println("5.�黹DVD");
		System.out.println("6.�˳�DVD");
		System.out.println("-------------------------------");
		

		
		do {
			System.out.println("��ѡ��");
			int a=sc.nextInt();
			switch(a) {
			case 1:
				//System.out.println("�˴�ʵ������DVD");
				System.out.println("������DVD���ƣ�");
				String temp1=sc.next();
				for(int i=0;i<7;i++) {
					if(name[i]==null) {
						name[i]=temp1;
						state[i]=1;
						data[i]=0;
						count[i]=0;
						break;
					}
					if(i==6) {
						//System.out.println("����"+"��"+temp1+"��"+"ʧ�ܣ�����������");
					}
				}
				
				break;
			case 2:
				//System.out.println("�˴�ʵ�ֲ鿴DVD");
				System.out.println("���"+"\t"+"״̬"+"\t"+"����"+"\t"+"�������"+"\t"+"�������");
				for(int i=0;i<7;i++) {
					if(name[i]==null) {
						break;
					}
					System.out.println(i+1+"\t"+state(state[i])+"\t"+name(name[i])+"\t"+data(data[i])+"\t"+count(count[i]));
				}
				break;
			case 3:
				//System.out.println("�˴�ʵ��ɾ��DVD");
				System.out.println("������DVD����");
				String tempName=sc.next();
				for(int i=0;name[i]!=null;i++) {
					if(name[i].equals(tempName)&&state[i]==1) {
						for(int j=i;j<7;j++) {
							if(name[j]==null) {
								for(int k=i;k<j;k++) {
								name[k]=name[k+1];
								data[k]=data[k+1];
								state[k]=state[k+1];
								count[i]=count[k+1];
							}
								name[j]=null;
								data[j]=0;
								state[j]=0;
								count[j]=0;
								
							}
							
							//name[]
						}
						//name[i]=name[i+1]
						System.out.println("ɾ��"+"��"+tempName+"��"+"�ɹ�");
						break;
					}
					if(name[i].equals(tempName)&&state[i]==0) {
						System.out.println("��"+tempName+"��"+"Ϊ���״̬������ɾ��");
						break;
					}
					if(name[i]==null) {
						System.out.println("û��ƥ����Ϣ");
						break;
					}
				}
				break;
			case 4:
				System.out.println("�˴�ʵ�ֽ��DVD");
				break;
			case 5:
				System.out.println("�˴�ʵ�ֹ黹DVD");
				break;
			case 6:
				System.out.println("�˴�ʵ���˳�DVD");
				break;
			default:
				System.out.println("�������");
			}
			System.out.println("��������(y/n)");
			action=sc.next();
		}while(action.equals("y"));
		
		sc.close();
	}
	//������״̬
	public static String state(int n) {
		if(n==0) {
			return "�ѽ��";
		}else {
			return "�ɽ�";
		}
	}
	//����������
	public static String data(int n) {
		if(n==0) {
			return " ";
		}else {
			return n+"��";
		}
	}
	//����������
	public static String count(int n) {
		return n+"��";
	}
	//�������
	public static String name(String n) {
		return "��"+n+"��";
	}
}
