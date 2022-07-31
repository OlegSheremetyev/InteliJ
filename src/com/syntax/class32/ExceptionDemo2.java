package com.syntax.class32;

public class ExceptionDemo2 {
    public static void main(String[] args) {

try{

        String name = null;
       // System.out.println(name.length());
    int[]arr={2};
    System.out.println(arr[5]);
} catch (NullPointerException npe ){
    System.out.println("You are trying to call a methood on a null object");
}catch (IndexOutOfBoundsException iobe){
    System.out.println("Please check the index that you are tryimg to accsses");
}catch (Exception genna){
    System.out.println("Something went wrong");
}
    }}