package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair =new Chair();
        chair.printColor();
    }
}
class Wood{
    String color="Blue";
}
class Furniture {
    String name="Table";
    String color="Black";


}
class  Chair extends Furniture{
    String color="Grey";

    void printColor(){
        String color="White";
        System.out.println(color);//white
        System.out.println(this.color);//gray
        System.out.println(super.color);//black
        // always local variable are preferred;



    }


}