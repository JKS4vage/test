package com.day1;

import java.util.Scanner;

public class GuessNumber_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=(int)(Math.random()*100+1);
		//System.out.println("随机数为："+num);
		for(int i=0;i<7;i++) {
			System.out.println("请输入数字：");
			int temp=sc.nextInt();
			System.out.println("请输入数字：");
			if(temp<num) {
				System.out.println("太小了，再大一点！");
			}else if(temp>num){
				System.out.println("太大了，再小一点！");
			}else {
				System.out.println("恭喜你猜对了！");
				break;
			}
			if(i==6) {
				System.out.println("你太笨了，下次再来吧！");
			}
		}
		sc.close();
	}
}
