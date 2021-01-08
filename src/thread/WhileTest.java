package thread;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("please input grade");
		while(i<6) {
			sum+=sc.nextInt();
			//sc.nextLine();
			i++;
			//sc.nextLine();
		}
		int pj=sum/5;
		System.out.println("平均成绩为："+pj);
		System.out.println(i);
	}
}
