package com.test;

public class Exam4 {
	
    public static void main(String[] args) {
        /**
         * 6行6列的杨辉三角
         */
    	int row = 6;
    	int [][] yanghui =new int [row][row];
    	for(int i = 0; i < row; i++) {
    		for(int j = 0; j <=i; j++) {
    			if(j == 0 || j == i) {
    				yanghui[i][j] = 1;

    			}else {
    				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
    			}
    			System.out.print(yanghui[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
    	//等腰三角形处理
    	for(int i=0; i<row; i++) {
    		for(int j=0;j<=row-i;j++) {
    			System.out.print(" ");
    		}
    		for(int k=0; k<=i; k++) {
    			System.out.print(yanghui[i][k]+ " ");
    		}
    		System.out.println();
    	}
    }
}
