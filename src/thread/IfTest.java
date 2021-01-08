package thread;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		int qw=30;
		String tq="buhao";
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter in");
		int week=sc.nextInt();
		sc.nextLine();
		System.out.println("please input tq");
		tq=sc.next();
		if(week==6||week==7) {
			if(qw>30) {
				System.out.println("去游泳");	
			}else {
				System.out.println("外出");
			}
		}else {
			if(tq.equals("hao")) {
				System.out.println("天气好，谈业务");
			}else {
				System.out.println("天气不好，查资料");
			}
		}
	}
}
