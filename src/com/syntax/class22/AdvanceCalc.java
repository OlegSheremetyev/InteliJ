package com.syntax.class22;

public class AdvanceCalc {
   /* void sum(int num1,int num2){
        System.out.println(num1+num2);

    }
     void sum(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
}
    void sum(int num1,int num2,int num3,int num4) {
        System.out.println(num1 + num2+num3+num4);
    }*/
   static void sum(int ... arr){
       // System.out.println(arr[3]);
       int sum=0;
       for(int j:arr){
           sum+=j;
       }
       // get all numbers of array
       //for(int i=0;i<arr.length;i++){
          // System.out.println(arr[i]);

           System.out.println("Sum of all parameter values is "+sum);
       }
       //...=Var args = variable argumemts
static void  printNames(String... names){
       for(String name:names){
           System.out.print(name);
       }
}

    public static void main(String[] args) {
        sum(1,2,3,4);
        printNames("Alladin ","Alladin ","Alladin ","Alladin ");
        int age=10;
        /*
        String name;
        if(age>18){
           name="time to go work";
        }else {
            name="time to go work";
    }
        System.out.println(name);
        */

        String name2=age>18?"time to go work":"enjoy no work";
        System.out.println(name2);
}}