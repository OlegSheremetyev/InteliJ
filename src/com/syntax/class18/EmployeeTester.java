package com.syntax.class18;

import com.syntax.class17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee empoloyee=new Employee();
        empoloyee.name="Merve";
        System.out.println(Employee.manager);
        Employee.printManager();// static fields methods can also be accessed by just writing name of the class

    }
}
