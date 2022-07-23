package com.syntax.class26.Arraylist;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual testing");
        subjects.add("Git");
        subjects.add("Java");
        System.out.println(subjects.indexOf("Git"));


    }
}
