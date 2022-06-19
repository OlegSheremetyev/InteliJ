package com.syntax.homework;

public class Constructors {
    String author;
    int pageCount;
    Constructors(String author){this.author=author;}

Constructors(String author,int pageCount) {
    this.author = author;
    this.pageCount = pageCount;
}

    public static void main(String[] args) {Constructors book1=new Constructors("Hemingay");
        Constructors java=new Constructors("No known,5000");

    }}