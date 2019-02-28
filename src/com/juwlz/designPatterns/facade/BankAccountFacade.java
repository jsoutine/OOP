package com.juwlz.designPatterns.facade;

public class BankAccountFacade {

    private int accountNumber;

    private int securityCode;

    private AccountNumberCheck acctChecker;
    private SecurityCodeCheck codeChecker;
    private FundsCheck fundChecker;

    private WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAcctNumber, int newSecCode) {

        accountNumber = newAcctNumber;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {

        if (acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction complete\n");
        } else {

            System.out.println("Transaction failed \n");
        }
    }

    public void depositCash(double cashToDeposit) {

        if (acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction complete.");
        }
    }

    public void checkCash () {

        if (acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.getCashInAccount();

            System.out.println("Your current balance is: " + fundChecker.getCashInAccount() + " SEK\n");
        }
    }
}
