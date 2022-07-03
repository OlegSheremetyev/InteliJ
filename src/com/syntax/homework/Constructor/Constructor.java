package com.syntax.homework.Constructor;

public class Constructor {
    static String name;
    static String adress;
    Constructor(String name,String address){
        this.name=name;
        this.adress=adress;}
    static void displayInfo(){
        System.out.println(name+" "+adress);



    }

    public static void main(String[] args) {
        Constructor task8=new Constructor("Jose", "streeet 123");
        Constructor.displayInfo();
    }
}
