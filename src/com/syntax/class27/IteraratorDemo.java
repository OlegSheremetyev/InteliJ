package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteraratorDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Bro");
        names.add("Bro1");
        names.add("Bro2");
        names.add("Bro3");
        for (String name:names) {
            // names.remove(name); wont work
            //if (name.contains("B")){
            // names.remove(name);
            // }
            Iterator<String> iterator = names.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }}}







