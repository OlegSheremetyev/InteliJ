package com.syntax.class29;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1000.0);// auto upcasting not working with wrappers
        fruit.put("Orange",2000.0);
        fruit.put("Kiwi",3000.0);
        fruit.put("Banana",4000.0);
        fruit.put("Apple",5000.0);
        System.out.println(fruit);
        System.out.println(fruit.get("Kiwi"));
        System.out.println(fruit.remove("Orange"));
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(2000.0));
        System.out.println(fruit.isEmpty());
        fruit.replace("Kiwi",15.2);



    }
}
