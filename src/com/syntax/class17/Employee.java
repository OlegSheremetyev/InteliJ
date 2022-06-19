package com.syntax.class17;

public class Employee {
    public String name;
    public static String manager="Cindy";
    public static void  printManager(){
        System.out.println(manager);
    }
    private int salary;
    String department;
    private void printSalary(){
        System.out.println("Salary "+salary);}
        void printDepartment(){
            System.out.println("Department "+ department);}
        public void printName(){
            System.out.println("Name "+name);
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Jason";
        emp.department="IT destroyer";
        emp.salary=1500000;
        emp.printName();
        emp.printDepartment();
        emp.printSalary();

    }
}
