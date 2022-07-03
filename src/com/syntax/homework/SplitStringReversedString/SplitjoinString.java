package com.syntax.homework.SplitStringReversedString;

public class SplitjoinString {
       static String a="hello";
       static String b="technology";


        public static void main(String[] args) {
            StringBuilder result = new StringBuilder();

            for(int i = 0 ; i < a.length(); i++)
            {
                result = result.append(a.charAt(i));
                if(i == a.length()-1)
                    break;
                result = result.append(' ');
            }

            System.out.println (result.toString());

        }

    }
