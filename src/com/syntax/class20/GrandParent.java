package com.syntax.class20;

public class GrandParent {
    String name ="Grandpa";

}
class Parent extends GrandParent{
    void printInfo(){
        System.out.println("Name of my father is "+name);
    }
}
class Child extends Parent{
    void printInfo(){
        System.out.println("Name of my Grandpa is  "+name );
    }
}
class GrandChild extends Parent{
    @Override
    void printInfo() {
        System.out.println("Name of my Grandpa is  "+name );
    }
}