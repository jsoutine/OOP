package com.juwlz.seminar2Task1;

public class Transaction implements Comparable<Transaction> {

    public String date;
    public float amount;

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }
}
