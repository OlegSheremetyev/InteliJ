package com.syntax.class15.com.syntax;


public class VariablesDemo1 {
    String breed;// instance
    static int num=5; //static instance num:5;
    void printName(){
        String name="Local"; // local variable
        System.out.println(name);
    }
String name;
    public static void main(String[] args) {
        VariablesDemo1 v=new VariablesDemo1();
        v.printName();//variablesDemo1@649
        VariablesDemo1 v1=new VariablesDemo1();
        v1.name="Naveed";
        VariablesDemo1 v2=new VariablesDemo1();
        v2.name="Mumtaz";
        VariablesDemo1 v3=new VariablesDemo1();
        v3.name="Jason";
        v1.num=10;
        v1.name="Sameer";
        System.out.println(v2.name);
        System.out.println(v2.num);


    }
}
