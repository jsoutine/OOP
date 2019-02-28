package com.juwlz.designPatterns.facade;

import java.util.Scanner;

public class Facade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int amount;
        boolean exit = false;

        BankAccountFacade accessingBank = new BankAccountFacade(1234, 1234);

        while (!exit) {
            System.out.println("What would you like to do today: \n" +
                    "1: Withdraw cash\n" +
                    "2: Deposit cash\n" +
                    "3: Check balance\n");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter amount: ");
                    amount = input.nextInt();
                    input.nextLine();
                    accessingBank.withdrawCash(amount);
                    break;
                case "2":
                    System.out.println("Enter amount: ");
                    amount = input.nextInt();
                    input.nextLine();
                    accessingBank.depositCash(amount);
                    break;
                case "3":
                    accessingBank.checkCash();
                    break;
                default:
                    System.out.println("Enter an option of 1-3");
            }
        }
    }
}
