package com.day2;

public class Exam4 {

    public static void main(String[] args) {

        int row = 6;//����
        int[][] yanghui = new int[row][row];//6��6������
         
        for (int i = 0; i < row; i++){//��
            for(int j = 0;j<= i;j++){//��
                if (j==0 || j==i){
                    yanghui[i][j]=1;
                     
                }else{
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
//              System.out.print(yanghui[i][j]+" ");
            }
//          System.out.println();
        }
//�����������
        for (int i = 0; i < row; i++){
            int num = row -i;
            for(int j = 0;j<= num;j++){
                System.out.print(" "); 
        }
            for(int k= 0;k<= i;k++){
                System.out.print(yanghui[i][k]+" ");   
        }
            System.out.println();
    }
     
    }
}
