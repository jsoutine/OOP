package com.juwlz.seminar2Task1;

public abstract class Account{

    public int MAX_WITHDRAW_AMOUNT = 1000;
    private float balance;
    private float interestRate;

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
