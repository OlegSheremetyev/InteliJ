package com.syntax.homework;

public class Task2SyntaxStudents {
    //create a class called students. Create 3 variables NAME ID and NUMBER of students
    //Set the value for student name student Id and icrement number of students for each object
    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Task2SyntaxStudents task2SyntaxStudents =new Task2SyntaxStudents();
        task2SyntaxStudents.name="Arif007";
        task2SyntaxStudents.ID="JB123";
        numberOfStudents=1;// if we are inside same class we can accsses static variables inside static methods
        // by just writing name of this variable, we dont need to create object
        System.out.println(task2SyntaxStudents.name);
        System.out.println(task2SyntaxStudents.ID);
        System.out.println(numberOfStudents);
        Task2SyntaxStudents task2SyntaxStudents2 =new Task2SyntaxStudents();
        task2SyntaxStudents2.name="Arif008";
        task2SyntaxStudents2.ID="JB1234";
        numberOfStudents=2;
        System.out.println(task2SyntaxStudents2.name);
        System.out.println(task2SyntaxStudents2.ID);
        System.out.println(numberOfStudents);


    }
}
