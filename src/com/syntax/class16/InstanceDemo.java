package com.syntax.class16;

public class InstanceDemo {
    String str="instance";
    void changeInstanceValue(){
        str="Captain marvel";

    }
    void printInstanceValue(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id= new InstanceDemo();
        System.out.println(id.str);// print the value of str
        id.printInstanceValue();// method once simple prints the value of str which instance
        id.changeInstanceValue();//changes instance variable value wich will be now Captain Marvel
        id.printInstanceValue();//method once simple prints the value of str which instance wich will be now Captain Marvel
    }
}
