package com.syntax.class28;

public class ListDemo {
    public static void main(String[] args) {
        Object []arr={"Hamid",10.2,"Name"};

        for (Object obj:arr){
            if(obj instanceof  String)//instance of checks if variable contains a specific type of obj
            System.out.println(((String)obj).length());
        }
    }
}
