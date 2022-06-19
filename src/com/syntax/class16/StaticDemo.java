package com.syntax.class16;

public class StaticDemo {
    static int noOfEmploees=10;
    String name;
    static void method1(){
        System.out.println(noOfEmploees);
       // System.out.println(name); error cause local variable
    }
     void method2(){

     }

    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();
        st.name="Omid";
        StaticDemo st2=new StaticDemo();
        st2.name="Rachid";

    }
}
