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
			System.out.println("******欢迎进入奖客富翁系统******");
			System.out.println("\t1.注册");
			System.out.println("\t2.登录");
			System.out.println("\t3.抽奖");
			System.out.println("*******************************");
			System.out.println();
			System.out.println("请选择菜单：");
			Scanner sc =new Scanner(System.in);
			num=sc.nextInt();
			switch(num){
			case 1:
				System.out.println("[奖客富翁系统> 注册]");
				System.out.println("请填写个人注册信息：");
				System.out.print("用户名：");
				name=sc.next();
				//System.out.println();
				System.out.print("密码:");
				password=sc.next();
				System.out.println("注册成功，请记好您的会员卡号");
				System.out.println("用户名\t"+"密码\t"+"会员卡号");
				cardNum=randomNum();
				System.out.println(name+"\t"+password+"\t"+cardNum);
				flag=true;
;				break;
			case 2:
				System.out.println("[奖客富翁系统> 登录]");
				if(!flag) {
					System.out.println("您还没有注册");
					break;
				}
				for(int i=2;i>=0;i--) {
				System.out.println("请输入用户名：");
				getName=sc.next();
				System.out.println("请输入密码：");
				getPassword=sc.next();
				if(name.equals(getName)&&password.equals(getPassword)) {
					System.out.println("欢迎您："+getName);
					break;
				}else {
					System.out.println("用户名密码错误，您还有"+i+"次机会");
				}
				}
				break;
				
			case 3:
				if(!flag) {
					System.out.println("请先登录");
					break;
				}
				System.out.println("[奖客富翁系统> 抽奖]");
				System.out.print("请输入您的卡号：");
//				int temp=sc.nextInt();
				while(cardNum!=sc.nextInt()) {
					System.out.println("您输入的卡号错误,重新输入");
				}
//				if(cardNum!=temp) {
//					System.out.println("您输入的卡号错误,系统退出");
//					break;
//					
//				}
				System.out.print("本日的幸运数字为：");
				for(int i=0;i<5;i++) {
					luckNum[i]=randomNum();
					System.out.print(luckNum[i]+"\t");
				}
				System.out.println();
				for(int i=0;i<luckNum.length;i++) {
					//System.out.println("第"+i);
					if(luckNum[i]==cardNum) {
						System.out.println("恭喜您成为本日幸运会员!");
						break;
					}
					if(i==luckNum.length-1) {
						System.out.println("抱歉！您不是本日幸运会员!");
					}
				}
				break;
			default:
				System.out.println("您的输入有误");
			}
			System.out.println("继续吗？(y/n):");
			action=sc.next();
			
		}while(action.equals("y"));
		System.out.println("系统退出，谢谢使用");
	

	}
}
