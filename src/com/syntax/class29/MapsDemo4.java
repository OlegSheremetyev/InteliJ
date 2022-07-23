package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {


    HashMap<String,Double> fruit=new HashMap<>();
            fruit.put("Apple",2000.0); //auto upcasting does not work with wrappers
            fruit.put("Orange",20.5);
            fruit.put("Kiwi",10.2);
            fruit.put("Banana",10.2);
            fruit.put("Peach",10.5);
        Set<String> keys=fruit.keySet();
       //cant use because we are trying to change size of map not allowed
        // for(String key:keys){
           // if(key.contains("e")){
            //    fruit.remove(key);
        Iterator<String> iterator= keys.iterator();
        while(iterator.hasNext()){if(iterator.next().contains("e")){
            iterator.remove();

                 }
             }
        System.out.println(fruit);
          }
      }