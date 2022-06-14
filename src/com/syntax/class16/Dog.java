package com.syntax.class16;

public class Dog {
    String name;
    String color;
    static int nooflegs=4;

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Tony";
        dog1.color="Black";
        System.out.println(dog1.name+" is "+ dog1.color);
    }
}
