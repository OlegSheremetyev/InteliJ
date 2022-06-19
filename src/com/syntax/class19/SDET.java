package com.syntax.class19;
//this name coming from parent class, need use extend
public class SDET  extends Human{
    public  boolean goodWithjava;

    SDET(String name, String eyeColor, String job, int age, boolean goodWithJava){
        this.name=name;
    this.eyeColor=eyeColor;
    this.job=job;
    this.age=age;
    this.goodWithjava=goodWithJava;}
    void printInfo(){
        System.out.println("My name is "+name+" I do "+job+" im good with Java "+goodWithjava);
    }

    public static void main(String[] args) {
        SDET sdet=new SDET("Sameer","block","gym",22,true);
        sdet.printInfo();
    }
}
