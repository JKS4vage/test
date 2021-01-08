package com.day2;

import java.util.Scanner;
public class Exam3 {  

	 public static void main(String[] args) {   
	   System.out.println("请输入一个奇数 :");   
	   Scanner in = new Scanner(System.in);   
	   int N = in.nextInt();    //为数组赋初始值 
	   int data[][] = new int[N][N];   
	   for (int i = 0; i < N; i++) {    
		   for (int j = 0; j < N; j++)     
			   data[i][j] = 0; 
	  
	   } 
	   printArray(data);    
	  //计算第一个元素存放的位置   
	   int row = 0; //声明行变量   
	   int col = N / 2; //声明列变量    
	  for (int i = 1; i <= N * N; i++) {    
		  System.out.println("data["+row+"]["+col+"] ="+ i);    
		  data[row][col] = i;     
	   // 始终保证是右上角的位置；    
		  row--;   
	 
		  col++; 
	 
	   // 行越界，列不越界； 
		  if (row < 0 && col < N) {     
		   row = N - 1;// col不变； 
	  
	 
		  } 
	    // 列越界，行不越界 
		  if (row >= 0 && col == N) {     
			  col = 0;// row不变；   
	 
		  } 
	 
	 
	 
	    // 最右上角  || 右上角有值； 
		  if ((row < 0 && col >= N) || (data[row][col] != 0)) {     
			  row += 2;     col--; 
		  } 
	  } 
	   	printArray(data);
	   	
	   	in.close();
	 } 
	  	private static void printArray(int[][] data) {
	  	for (int i = 0; i < data.length; i++) {    
	  		for (int j = 0; j < data.length; j++) {     
	  			System.out.print((data[i][j] < 10 ? "0"+data[i][j]:data[i][j])+ " "); 
	  		}	 
	   System.out.println(); 
	  } 
	 } 
	} 
