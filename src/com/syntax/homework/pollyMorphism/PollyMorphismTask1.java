package com.syntax.homework.pollyMorphism;

public class PollyMorphismTask1 {
    /*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */

}
class Student{
   void practise(){
       System.out.println("Student must practise");
   }
    void study(){
        System.out.println("Students must study");
    }
    void doHomework(){
        System.out.println("Students should do homework");
    }

}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax Students must learn programming");
    }
void doHomework(){
    System.out.println("Syntax students must learn programming");

    }
    void practise(){
        System.out.println("Syntax students must practise to get a good job");
}
}
class CollegeStudent extends Student{
    void study(){
        System.out.println("CollegeStudent must learn programming");
    }
    void doHomework(){
        System.out.println("CollegeStudent must learn programming");

    }
    void practise(){
        System.out.println("CollegeStudent must practise to get a good job");
    }

}
class SchoolStudent extends Student{
    void study(){
        System.out.println("SchoolStudent must learn programming");
    }
    void doHomework(){
        System.out.println("SchoolStudent must learn programming");

    }
    void practise(){
        System.out.println("SchoolStudent must practise to get a good job");
    }


}