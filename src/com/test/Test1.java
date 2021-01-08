package com.test;

class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}

public class Test1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println("Dog的叫声：");
		animalCry(dog);   
		dog.shout();	//直接调用dog的方法
		System.out.println("Cat的叫声：");
		animalCry(cat);
		cat.shout();  	//直接调用cat的方法
		
	    }
	//如果没有多态，我们这里需要写很多重载的方法。
    //每增加一种动物，就需要重载一种动物的喊叫方法。非常麻烦
	static void animalCry(Dog d) {
		d.shout();
	}
	static void animalCry(Cat c) {
		c.shout();
	}
	

}
