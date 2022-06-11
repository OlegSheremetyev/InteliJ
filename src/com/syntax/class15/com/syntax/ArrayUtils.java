package com.syntax.class15.com.syntax;

public class ArrayUtils {
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ArrayUtils array=new ArrayUtils();
        ArrayUtils.printArray(arr);


    }
}