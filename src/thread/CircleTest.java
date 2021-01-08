package thread;

public class CircleTest {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	
	
		double gold=0.618;
		double s=0,min=1,c = 0,d = 0;
		for(int i=1;i<=20;i++) {
			for(int j=i+1;j<=20;j++) {
				s=(double)i/j;
				if((i%2==0)&&(j%2==0)) {
					continue;
				}	
				if(Math.abs(s-gold)<min) {
					min=Math.abs(s-gold);
					c=i;
					d=j;	
					}
				}
		}
		System.out.println("离黄金分割点最近的两个数相除是："+(int)c+"/"+(int)d+"="+c/d);
		//System.out.println("离黄金分割点最近的两个数相除是："+min);

//寻找所以的水仙花数
		System.out.println("水仙花数为：");
		for(int i=101;i<=999;i++) {
			int g=i%10;
			int s1=i/10%10;
			int b =i/100;
			if(g*g*g+s1*s1*s1+b*b*b==i) {
				System.out.println(i);
			}
		}
		System.out.println();

//九九乘法表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
		}	
}
}
