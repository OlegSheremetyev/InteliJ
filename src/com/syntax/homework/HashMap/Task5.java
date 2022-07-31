package com.syntax.homework.HashMap;

import java.util.HashMap;
import java.util.Map;

/*
    Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who
    gets the highest salary. Output should be in the below format
John Smith=$100000
     */
public class Task5 {
    public static void main(String[] args) {

        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("Sam", 25000);
        employee.put("Roman", 67000);
        employee.put("Chris", 45000);
        employee.put("Robert", 89000);
        employee.put("Tom", 56000);
        employee.put("Constance", 76000);

        String name="";
        Integer maxSalary=0;
        for(Map.Entry<String, Integer> entry: employee.entrySet()) {
            if(entry.getValue()>maxSalary) {
                maxSalary = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(name+" earns the higherst salary"+maxSalary);
    }
}