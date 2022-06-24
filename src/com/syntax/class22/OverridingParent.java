package com.syntax.class22;

public class OverridingParent {
   String name;
   void getMarried(){

        System.out.println("Hey Hamid we have found a girl for you married to that girl ");
    }
}
class Hamid extends OverridingParent{
   void getMarried(){
       super.getMarried();
       System.out.println("I want to try on Tara first");
   }

    public static void main(String[] args) {
        Hamid hamid=new Hamid();
        hamid.getMarried();
    }
}