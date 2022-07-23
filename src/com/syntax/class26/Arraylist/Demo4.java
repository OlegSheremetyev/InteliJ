package com.syntax.class26.Arraylist;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        System.out.println(names);
        names.remove("b");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
    }

}
