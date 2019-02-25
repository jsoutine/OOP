package com.juwlz.errorHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean go = false;

        while (!go) {
            try {
                System.out.println("Write a number: ");
                number = input.nextInt();
                go = true;
            } catch (InputMismatchException e) {
                System.err.println("That's not a number.");
                input.nextLine();
                go = false;
            }
        }
        //number = number +5;

        System.out.println("The result is: " + (number + 5));
    }
}
