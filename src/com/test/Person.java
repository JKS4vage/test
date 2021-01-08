package com.test;

public class Person {
	int age  = 20;
	String name ="张三";
	char sex ='男';
	String hobby = "骑行，听歌，旅游";
	String skill ="编程";
	
	void selfIntroduce() {
		System.out.println("大家好，我叫"+name+",今年"+age+"岁，"+"喜欢"+hobby+"我会"+skill);
	}
	
}
