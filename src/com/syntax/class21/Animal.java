package com.syntax.class21;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    //parent class

    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    void printInfo(){
        System.out.println("name "+name+" color "+color+" breed "+breed+" age "+age);

    }
    //child class
}// child class need to have constructor if parent does
class Dog extends Animal{

    public Dog(String name, String color, String breed, int age) {
        super(name, color, breed, age);
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed, int age) {
        super(name, color, breed, age);
    }
}