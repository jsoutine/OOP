package com.juwlz.seminar2Task1;

public class Customer {

    public int SALARY_ACCOUNT_ID = 0;
    public int SAVINGS_ACCOUNT_ID = 1;

    private int amount;
    private String date;
    private int accountNumber;

    public void withDraw(int amount, String date, int accountNumber){
        this.amount = amount;
        this.date = date;
        this.accountNumber = accountNumber;
    }

    public int getSALARY_ACCOUNT_ID() {
        return SALARY_ACCOUNT_ID;
    }

    public int getSAVINGS_ACCOUNT_ID() {
        return SAVINGS_ACCOUNT_ID;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
