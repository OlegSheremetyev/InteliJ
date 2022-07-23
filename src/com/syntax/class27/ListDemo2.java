package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends=new ArrayList<>();//recommended
        legends.add("Hamid");
        legends.add("karla");
        legends.add("Yusuf");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        ArrayList<String> moreStudents=new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handan");
        ArrayList<String> allStudents=new ArrayList<>();
        allStudents.addAll(moreStudents);
        allStudents.addAll(legends);
        System.out.println(allStudents);
        allStudents.removeAll(legends);
        System.out.println(allStudents);
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));

        legends.set(0,"hamid jan");//replace index
        System.out.println(legends);
        System.out.println(legends.indexOf("Yusuf"));
        System.out.println(legends.lastIndexOf("Yusuf"));

    }
}
