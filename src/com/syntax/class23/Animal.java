package com.syntax.class23;

public  class Animal {
    Animal(){
        System.out.println("parent");
    }
    void eat(){
        System.out.println("All animal eat");
    }
}
class Panda extends Animal{
    void eat(){
        System.out.println("All animal eat");

    }

}