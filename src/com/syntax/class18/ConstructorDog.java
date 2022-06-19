package com.syntax.class18;

import com.syntax.class16.Dog;

public class ConstructorDog { String name;


    public static void main(String[] args) {
       Dog dog=new Dog("Jofy","Russian","Black",2,25);
       dog.printInfo();
        Dog dog2=new Dog("Tony","German","White",3,15);
        dog.printInfo();


    }
}

