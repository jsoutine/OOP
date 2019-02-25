package com.juwlz.seminar2Task1;

public abstract class Person {



    protected String name;
    private String SSN;

    public Person(String name, String SSN){
        this.name = name;
        this.SSN = SSN;
    }

    public static Boolean ValidateSSN(String SSN){
        if(SSN.length() == 10){
            System.out.println("Good");
            return true;
        } else{
            System.out.println("Not 10 numbers");
            return false;
        }

    }

    public abstract void showInfo();

}


