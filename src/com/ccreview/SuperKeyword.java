package com.ccreview;

public class SuperKeyword {
    public static void main(String[] args) {
        //d.printColor();
        //d.work();
        Dog d = new Dog();
    }
}
/*
//super is used to refer immediate parent class instance variableqc
    class Animal{
        String color="white";
    }
    class Dog extends Animal{
        String color="black";
        void printcolor(){
            System.out.println(color);
            System.out.println(super.color);
        }
    }

 */
/*
//super can be used to invoke parent class method
class Animal {
    public static void eat() {
        System.out.println("eating....");
    }
}
    class Dog extends Animal{
        public static void eat(){
            System.out.println("eating braid...");
        }
        void bark(){
            System.out.println("barking...");
        }
        void work(){
            super.eat();
            bark();
        }
}

 */
//super is used to invoke parent class constructor
class Animal{
    Animal(){
        System.out.println("animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("dog is created");
    }
}


