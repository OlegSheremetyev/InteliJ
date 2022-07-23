package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("Game");
       /* for (String word:words){
            if(word.endsWith("e")){
                word.remove(word);
        */
        /*for (int i=0;i< words.size();i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println(words);
        both methods change size of array so we cant use loops that do that
         */
        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
        //System.out.println(iterator.next());
        words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);
    }
}
