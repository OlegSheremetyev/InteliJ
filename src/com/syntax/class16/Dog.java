package com.syntax.class16;

public class Dog {
    public Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if (dogAge<25){
            age=dogAge;}else{
            System.out.println("Dog age cant be greater than 25");
        }
        age=dogAge;
        weight=dogWeight;}
    String name;
    String color;
    String breed;
    int age;
    double weight;
    static int nooflegs=4;

    public Dog() {

    }

    public static void main(String[] args) {
        Dog dog1=new Dog();
       dog1.name="Tony";
        dog1.color="Black";
        dog1.breed="Doberman";
        dog1.age=8;
        dog1.weight=25;
        System.out.println(dog1.name+" is "+ dog1.color);
    }

    public void printInfo() {
        System.out.println(name+breed+color+age+weight );
    }
}
