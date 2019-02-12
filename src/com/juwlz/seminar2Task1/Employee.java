package com.juwlz.seminar2Task1;

public class Employee extends Person {

    public Employee(String name, String SSN, int accountNumber) {
        super(name, SSN, accountNumber);
    }

    private int salary;

    public int getSalary() {
        return salary;
    }
}
