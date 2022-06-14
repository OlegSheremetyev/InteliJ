package com.syntax.class16;

public class GoogleEmpoyees {
    String name;
    double salary;
   static int noOfEmployee;
    static String companyName="Google";
    void displayemploeeInfo(){
        System.out.println("Name "+name+" Salary "+salary+" Company name "+ companyName+" "+noOfEmployee);
    }

    public static void main(String[] args) {
        GoogleEmpoyees emp1=new GoogleEmpoyees();
        emp1.name="Oleg";
        emp1.salary=2500000;
        emp1.noOfEmployee=1;


        GoogleEmpoyees emp2=new GoogleEmpoyees();
        emp2.name ="Sameer";
        emp2.salary=25000001;
        emp2.noOfEmployee=2;
        emp2.displayemploeeInfo();
        emp1.displayemploeeInfo();

    }
}
