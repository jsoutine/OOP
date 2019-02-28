package com.juwlz.seminar2Task1;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Account {

    public int MAX_WITHDRAW_AMOUNT = 1000;
    private float balance;
    private float interestRate;

    ArrayList<Transaction> transactions = new ArrayList<>();


    public void showAllTransactionsSortedOnAmount(){

    }

    public void withDraw(int amount, String date){

    }

    public float getBalance() {
        return balance;
    }

    public float getInterestRate(){
        return interestRate;
    }
}
