package com.test;

public class Hero {
    
    String name; //����
       
    float hp; //Ѫ��
       
    float armor; //����
       
    int moveSpeed; //�ƶ��ٶ�
    
    public Hero(){
    	
    }
    
    public Hero(String name,float hp){
    	this.name = name;
        this.hp = hp;
    }

    //����
    public Hero revive(Hero teemo){
    	teemo=new Hero("��Ī",383);
    	return teemo ;
    }

    public static void main(String[] args) {
        Hero teemo =  new Hero("��Ī",383);
        
        //�ܵ�400�˺�������
        teemo.hp = teemo.hp - 400;
        
        teemo.revive(teemo);
        System.out.println(teemo.hp);
        //���⣺ System.out.println(teemo.hp); ������٣� ��ô��⣿
        
    }
     
}
