package com.day2;

import java.util.Scanner;
/*
 * 用二维字符数组保存一首唐诗（五言或七言），每一行代表一句，要求将这首唐诗按照古文的方式输出出来
（从右至左，竖行排列）。。。 

岱宗夫如何？齐鲁青未了。造化钟神秀，阴阳割昏晓。荡胸生层云，决眦入归鸟。会当凌绝顶，一览众山小。
 */
public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数和类型");
		int line = sc.nextInt();
		int type =sc.nextInt();
		
		System.out.println("请输入古诗：");
		String string =sc.next();
		char [] c1 = string.toCharArray();
		char [][] c = new char [line][(type+1)*2];
		char [][] c2 = new char [(type+1)*2][line];
		int k = 0;
		//将一维数组数据存到二维数组
		for(int i=0; i<line; i++) { 
			for(int j=0; j<(type+1)*2; j++) { 
				c[i][j]=c1[k];
				k++;
			}
			
		}
		
		//输出古诗
		for(int i=0;i<(type+1)*2;i++) {
			for(int j=0;j<line;j++) {
				c2[i][j] = c[line-j-1][i];//数组元素位置变换规则(****重点****)
				System.out.print(c2[i][j]);
			}
			System.out.println();
		}
		sc.close();
		
	}

}
