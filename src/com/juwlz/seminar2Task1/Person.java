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
            return true;
        } else{
            return false;
        }

    }

    public abstract void showInfo();

}


