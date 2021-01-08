package thread;

import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
		int sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的名字：");
		String name=sc.nextLine();
		System.out.println("请输入你的成绩：");
		for(int i=0;i<5;i++) {
			sum+=sc.nextInt();
		}
		avg=sum/5;
		System.out.println("平均成绩为："+avg);
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
