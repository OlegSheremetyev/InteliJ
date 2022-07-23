package com.syntax.class28;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruit =new HashSet<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("orange");
        System.out.println(fruit);

    }
}
