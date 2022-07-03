package com.syntax.homework.SplitStringReversedString;

public class MethodPrintOnlyVowels {
    private static String getVowels(String input){
        return input.replaceAll("[^aeiou]","");
    }

    public static void main(String[] args) {
        System.out.println(getVowels("emre"));
    }
}
