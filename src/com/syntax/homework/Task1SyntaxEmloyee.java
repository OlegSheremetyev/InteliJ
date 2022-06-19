package com.syntax.homework;

public class Task1SyntaxEmloyee {/*
Create a Class called SyntaxEmployee:
Create 3 variables empID, salary and set CEO to "Sumair";
Create 2 objects of class SyntaxEmployee
Set the value of eID salary for each of the objects*/
    String empID;
    int salary;
    //whenever we are sure that two objects of a class can have different values for a variable
    //or if we have to share that variable between two or more methods of that class we should always go with instance variables
    static String CEO="SUMAEER";

    public static void main(String[] args) {

      Task1SyntaxEmloyee emp=new Task1SyntaxEmloyee();
      Task1SyntaxEmloyee emp2=new Task1SyntaxEmloyee();
        emp.empID="123";
        emp.salary=2000000;
        emp2.empID="1234";
        emp2.salary=250000;
        System.out.println(emp.empID);
        System.out.println(emp.salary);
        System.out.println(emp2.empID);
        System.out.println(emp2.salary);


    }
}
