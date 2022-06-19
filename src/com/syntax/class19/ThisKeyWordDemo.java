package com.syntax.class19;

public class ThisKeyWordDemo {
    String name="instance";
    void printName(){String name="local";
        System.out.println(name);
        System.out.println(this.name);}

    public static void main(String[] args) {
        ThisKeyWordDemo t=new ThisKeyWordDemo();
        t.printName();
    }
}
