package com.juwlz.singleton;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstInstance = null;

    private String[] letters ={"a","b","c","d"};

    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(letters));

    static boolean firstThread = true;

    private Singleton(){}

    public static Singleton getInstance(){

        if (firstInstance == null){
            firstInstance = new Singleton();
        }

        return firstInstance;
    }
}
