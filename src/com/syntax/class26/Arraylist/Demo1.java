package com.syntax.class26.Arraylist;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
       //1
        String[] names={"Aladin","Reza","Ahmed"};
        System.out.println(names.length);
        //2
        names=new String[4];
        names[0]="Aladin";
        names[1]="Reza";
        names[2]="Ahmed";
        names[3]="Zameer";
        System.out.println(names.length);
        //Array list
        ArrayList<String> syntaxStudents=new ArrayList<>();
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Riaz");
        System.out.println(syntaxStudents.size());
        ArrayList<Integer>number= new ArrayList<>();

        for (int i=1;i<10;i=i+2){
            number.add(i);
        }
        System.out.println(number);

    }
}
