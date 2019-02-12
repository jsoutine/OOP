package com.juwlz.seminar2Task1;

public class Person {

    protected String name;
    private String SSN;

    public Person(String name, String SSN){
        this.name = name;
        this.SSN = SSN;
    }

    public Boolean ValidateSSN(String SSN){
        if(SSN.startsWith("0")){
            return true;
        } else{
            return false;
        }

    }
}


