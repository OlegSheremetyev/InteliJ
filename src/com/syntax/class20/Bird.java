package com.syntax.class20;

public class Bird {

    String name;
    String color;
    int age;
    double weight;


    public  Bird(String name, String color, int age, double weight) {

}
public class Parrot extends Bird{
    Parrot(String name,String color,int age,double weight){
        super(name,color,age,weight);

        this.name=name;
        this.color=color;
       this.age=age;
        this.weight=weight;

    }

    }
    class sparrow extends Bird {
        sparrow(String name, String color, int age, double weight) {
            super(name, color, age, weight);
            this.name=name;
            this.color=color;
             this.age=age;
            this.weight=weight;
        }

        public static void main(String[] args) {
            System.out.println("Hello");
        }

    }}