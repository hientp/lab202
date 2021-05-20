package com.java2novice.junit.samples;

import java.util.ArrayList;
import java.util.List;

public class Breakword {
    private static String[] words = {"abstract", "continue",
            "boolean", "private", "this"," break ", "double"};

    public static boolean hasBreakWord (String sentence){
        boolean containsword = false;
        for (int i=0; i< words.length; i++){
            if(sentence.contains(words[i])){
                containsword = true;
            }
        }
        return containsword;

    }
}
