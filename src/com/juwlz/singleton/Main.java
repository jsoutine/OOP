package com.juwlz.singleton;

public class Main {

    public static void main(String[] args) {

        LibrarySystem libSys = LibrarySystem.getInstance();
        libSys.showInfo();
    }
}
