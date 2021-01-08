package com.dvd;

class Animal{
    public Animal(){}
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
class Cat extends Animal{
    public Cat(){}
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void sleep(){
        System.out.println("猫趴着睡觉");
    }
}
class Dog extends Animal{
    public Dog(){}
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void sleep(){
        System.out.println("狗站着睡觉");
    }
}
class Pig extends Animal{
    public Pig(){}
    public void eat(){
        System.out.println("猪吃草");
    }
    public void sleep(){
        System.out.println("猪也趴着睡觉");
    }
}

class AnimalTool{
    //总结： 使用static方法与priva的原因是，避免有些笨蛋
    //直接使用创建工具类对象的方式来访问工具类中的方法
    private AnimalTool(){}
    public static void useCat(Cat c){
        c.eat();
        c.sleep();
    }
    public static void useDog(Dog d){
        d.eat();
        d.sleep();
    }
    public static void usePig(Pig p){
        p.eat();
        p.sleep();
    }
    
    public static void useAnimal(Animal a){
        a.eat();
        a.sleep();
    }

}
class DuoTaiDemo2{
    public static void main(String []args){
        Cat c=new Cat();
        c.eat();
        c.sleep();

        Cat c2=new Cat();
        c2.eat();
        c2.sleep();

        Cat c3=new Cat();
        c3.eat();
        c3.sleep();
        System.out.println("----------------");
        //接下来是狗
        Dog d=new Dog();
        d.eat();
        d.sleep();

        Dog d2=new Dog();
        d2.eat();
        d2.sleep();

        Dog d3=new Dog();
        d3.eat();
        d3.sleep();
        System.out.println("----------------");

        //接下来是 猪
        Pig p=new Pig();
        p.eat();
        p.sleep();

        Pig p2=new Pig();
        p2.eat();
        p2.sleep();

        Pig p3=new Pig();
        p3.eat();
        p3.sleep();
 
        System.out.println("----------接下来利用工具类实现以上效果----------");

        AnimalTool.useCat(c);
        AnimalTool.useCat(c2);
        AnimalTool.useCat(c3);

        System.out.println("-------------");

        AnimalTool.useDog(d);
        AnimalTool.useDog(d2);
        AnimalTool.useDog(d3);

        System.out.println("-------------");

        AnimalTool.usePig(p);
        AnimalTool.usePig(p2);
        AnimalTool.usePig(p3);
 
        System.out.println("----------接下来利用【多态性】类实现以上效果----------");
        Animal cc=new Cat();
        AnimalTool.useAnimal(cc);

        Animal dd=new Dog();
        AnimalTool.useAnimal(dd);

        Animal pp=new Pig();
        AnimalTool.useAnimal(pp);
    }
}