package com.syntax.homework.pollyMorphism;

public class PollyMorphismTask1Tester {
    public static void main(String[] args) {
        Student[] students=
                {new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (Student st:students){
            st.study();
            st.practise();
            st.doHomework();
        }
        System.out.println("--------------------------------");
        for (int i=0;i<students.length;i++){
            students[i].study();
            students[i].practise();
            students[i].doHomework();
        }

    }
}
