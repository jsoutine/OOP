package com.juwlz.seminar2Task1;

public class Customer extends Person{

    public static int SALARY_ACCOUNT_ID = 0;
    public static int SAVINGS_ACCOUNT_ID = 1;

    private int amount;
    private String date;
    private int accountNumber;

    public Customer(String name, String SSN) {
        super(name, SSN);
    }

    @Override
    public void showInfo() {
        //arraylist transactions accounts;
    }

    public void withDraw(int amount, int accountNumber, String date ){
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
