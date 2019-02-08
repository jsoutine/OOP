package com.juwlz.singleton;

public class LibrarySystem {

    private static final LibrarySystem librarySystem = new LibrarySystem();

    private LibrarySystem(){}

    public static LibrarySystem getInstance(){
        return librarySystem;
    }

    public void showInfo(){
        System.out.println("info");

    }
}
