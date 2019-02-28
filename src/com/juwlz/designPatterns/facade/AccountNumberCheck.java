package com.juwlz.designPatterns.facade;

public class AccountNumberCheck {

    private int accountNumber = 1234;

    public int getAccountNumber() {return accountNumber;}

    public boolean accountActive(int acctNumToCheck){
        if (acctNumToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
