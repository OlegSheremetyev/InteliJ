package com.syntax.homework.HashMap;
/*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        TreeMap<String,String> countryCapitalMap=new TreeMap<>();
        countryCapitalMap.put("Turkiye","Ankara");
        countryCapitalMap.put("Azerbaijan","Baku");
        countryCapitalMap.put("Pakistan","Islamabad");
        countryCapitalMap.put("Kazahstan","Astana");
        for(Map.Entry<String,String>entry:countryCapitalMap.entrySet()){
            System.out.println("entry= "+entry.getKey()+"entry value= "+entry.getValue());

        }
        //countryCapitalMap.entrySet().iterator();
        Iterator<Map.Entry<String,String>> iterator=countryCapitalMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println("entry.getKey()= "+entry.getKey()+" value= "+entry.getValue());

        }
        System.out.println("*********************************");
        Collection<String> values=countryCapitalMap.values();
        for(String countries:values){
            System.out.println("counntrie="+countries);

    }
        System.out.println("*********************************");
        Iterator<String> iter=countryCapitalMap.values().iterator();
        while
        (iter.hasNext()){
            System.out.println("Capitals= "+iterator.next());
        }
}}
