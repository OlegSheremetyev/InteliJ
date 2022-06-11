package com.syntax.class15.com.syntax;

public class Task3 {
    void printispalindrome(String str){
    StringBuilder stringBuilder=new StringBuilder(str);
    stringBuilder.reverse();
    String reversedStr=stringBuilder.toString();
    if(str.equals(reversedStr)){
        System.out.println("String is palindrome");}
    else {
        System.out.println("String is Not palindrome");}}
    public static void main (String[]args){
        Task3 task3=new Task3();

        task3.printispalindrome("dad");
        task3.printispalindrome("alladin");
    }
}
