package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> legends=new ArrayList<>();
        legends.add("Hamid");
        legends.add("karla");
        legends.add("Naveed");
        legends.add("Tara");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Baham"));
        System.out.println(legends.contains("Hamid"));
        Object[] arr=legends.toArray();
        System.out.println(arr[0]);
        legends.remove(("Hamid"));
        System.out.println(legends);
        List<String> someStudents =new ArrayList<>();
        someStudents.add("Abdul");
        someStudents.add("Hamid");
        System.out.println(legends.containsAll(someStudents));


    }
}
