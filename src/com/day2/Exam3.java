package com.day2;

import java.util.Scanner;
public class Exam3 {  

	 public static void main(String[] args) {   
	   System.out.println("������һ������ :");   
	   Scanner in = new Scanner(System.in);   
	   int N = in.nextInt();    //Ϊ���鸳��ʼֵ 
	   int data[][] = new int[N][N];   
	   for (int i = 0; i < N; i++) {    
		   for (int j = 0; j < N; j++)     
			   data[i][j] = 0; 
	  
	   } 
	   printArray(data);    
	  //�����һ��Ԫ�ش�ŵ�λ��   
	   int row = 0; //�����б���   
	   int col = N / 2; //�����б���    
	  for (int i = 1; i <= N * N; i++) {    
		  System.out.println("data["+row+"]["+col+"] ="+ i);    
		  data[row][col] = i;     
	   // ʼ�ձ�֤�����Ͻǵ�λ�ã�    
		  row--;   
	 
		  col++; 
	 
	   // ��Խ�磬�в�Խ�磻 
		  if (row < 0 && col < N) {     
		   row = N - 1;// col���䣻 
	  
	 
		  } 
	    // ��Խ�磬�в�Խ�� 
		  if (row >= 0 && col == N) {     
			  col = 0;// row���䣻   
	 
		  } 
	 
	 
	 
	    // �����Ͻ�  || ���Ͻ���ֵ�� 
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
