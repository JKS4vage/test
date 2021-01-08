package com.test;

class Animal {
    public void shout() {
        System.out.println("����һ����");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("��������");
    }
    public void seeDoor() {
        System.out.println("������....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("����������");
    }
}

public class Test1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println("Dog�Ľ�����");
		animalCry(dog);   
		dog.shout();	//ֱ�ӵ���dog�ķ���
		System.out.println("Cat�Ľ�����");
		animalCry(cat);
		cat.shout();  	//ֱ�ӵ���cat�ķ���
		
	    }
	//���û�ж�̬������������Ҫд�ܶ����صķ�����
    //ÿ����һ�ֶ������Ҫ����һ�ֶ���ĺ��з������ǳ��鷳
	static void animalCry(Dog d) {
		d.shout();
	}
	static void animalCry(Cat c) {
		c.shout();
	}
	

}
