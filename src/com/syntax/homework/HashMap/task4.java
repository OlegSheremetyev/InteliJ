package com.syntax.homework.HashMap;

import java.util.TreeMap;

/*
  Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
   */
public class task4 {
    public static void main(String[] args) {
        TreeMap<Integer,Person> personTreeMap=new TreeMap<>();
        personTreeMap.put(1,new Person("Zameer","zombi",300,100000));
       personTreeMap.put(2,new Person("Arif","unknown",25,10000));
        personTreeMap.put(3,new Person("Ozkan","Kara",22,1000));
        personTreeMap.put(4,new Person("Azghar","Nazir",27,100));
        for(Person p: personTreeMap.values()){
            System.out.println(p);
        }

    }
}
class  Person{
    private String firstName;
    private String lastName;
    int age;
    double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.firstName = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
