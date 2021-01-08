package com.dvd;
//暂时做到删除
import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String action;
		String [] name=new String [7];//存储DVD名称
		int [] state =new int [7];//存储DVD借出状态：0已借出，1可借
		int [] data =new int [7];//存储DVD借出日期
		int [] count =new int [7];//存储DVD借出次数
		
		
		name[0]="罗马假日";
		name[1]="风声鹤唳";
		name[2]="浪漫满屋";
		state[0]=0;
		state[1]=1;
		state[2]=1;
		data[0]=1;
		data[1]=0;
		data[2]=0;
		count[0]=15;
		count[1]=12;
		count[2]=30;
		
		
		
		
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("-------------------------------");
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("6.退出DVD");
		System.out.println("-------------------------------");
		

		
		do {
			System.out.println("请选择：");
			int a=sc.nextInt();
			switch(a) {
			case 1:
				//System.out.println("此处实现新增DVD");
				System.out.println("请输入DVD名称：");
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
						//System.out.println("新增"+"《"+temp1+"》"+"失败！货架已满！");
					}
				}
				
				break;
			case 2:
				//System.out.println("此处实现查看DVD");
				System.out.println("序号"+"\t"+"状态"+"\t"+"名称"+"\t"+"借出日期"+"\t"+"借出次数");
				for(int i=0;i<7;i++) {
					if(name[i]==null) {
						break;
					}
					System.out.println(i+1+"\t"+state(state[i])+"\t"+name(name[i])+"\t"+data(data[i])+"\t"+count(count[i]));
				}
				break;
			case 3:
				//System.out.println("此处实现删除DVD");
				System.out.println("请输入DVD名称");
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
						System.out.println("删除"+"《"+tempName+"》"+"成功");
						break;
					}
					if(name[i].equals(tempName)&&state[i]==0) {
						System.out.println("《"+tempName+"》"+"为借出状态，不可删除");
						break;
					}
					if(name[i]==null) {
						System.out.println("没有匹配信息");
						break;
					}
				}
				break;
			case 4:
				System.out.println("此处实现借出DVD");
				break;
			case 5:
				System.out.println("此处实现归还DVD");
				break;
			case 6:
				System.out.println("此处实现退出DVD");
				break;
			default:
				System.out.println("输入错误");
			}
			System.out.println("继续操作(y/n)");
			action=sc.next();
		}while(action.equals("y"));
		
		sc.close();
	}
	//输出借出状态
	public static String state(int n) {
		if(n==0) {
			return "已借出";
		}else {
			return "可借";
		}
	}
	//输出借出日期
	public static String data(int n) {
		if(n==0) {
			return " ";
		}else {
			return n+"日";
		}
	}
	//输出借出次数
	public static String count(int n) {
		return n+"次";
	}
	//输出名称
	public static String name(String n) {
		return "《"+n+"》";
	}
}
