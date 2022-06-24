package com.syntax.homework;
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */

public class OverloadingTask2 {
    static void SayHello() {
        System.out.println("Hello batch 13");
    }

    static void SayHello(String msg) {
        System.out.println(msg);
    }

    static void SayHello(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        SayHello();
    }
}