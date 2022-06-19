package com.syntax.class19;
//rules
//1 Constructors have no return types not even void
//2 Name of the constructor should be same as name of class
//3 Constructors cant be created with a static key word
//4 we can access modifiers with Constructors
//5 If we dont create a constructor in a class a default constructor with zero parametrs is created by compiler
// Takes the code return by us , and it converts that code to byte code for java to understand
public class Car {
    String make;
    String model;
    String color;
   public  Car(String carMake,String carModel,String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }
    public Car (String carModel){model=carModel;}
    void printCarModel(){
        System.out.println("Model "+model);
    }
    void printInfo(){
        System.out.println("Make "+make+" Model "+model+" Color "+color);
    }

    public static void main(String[] args) {
        Car bmw=new Car ("Bmw","m4","Black");

    }
}
