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
				System.out.println("ȥ��Ӿ");	
			}else {
				System.out.println("���");
			}
		}else {
			if(tq.equals("hao")) {
				System.out.println("�����ã�̸ҵ��");
			}else {
				System.out.println("�������ã�������");
			}
		}
	}
}
