package com.juwlz.errorHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int amount = 0;
        boolean pass = false;


        while (!pass) {
            try {
                System.out.println("How many numbers would you like to enter: ");
                amount = input.nextInt();
                pass = true;
            } catch (InputMismatchException e) {
                System.err.println("Numbers, yo");
                pass = false;
                input.nextLine();
            }
        }

        pass = false;

        while (!pass) {
            try {
                for (int i = 0; i < amount; i++) {
                    System.out.println("Enter number " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();
                    pass = true;
                }
            } catch (InputMismatchException e) {
                System.err.println("Only numbers.");
                pass = false;
                input.nextLine();
            }
        }

        for (
                int place : numbers) {
            System.out.print(place + ", ");
        }
    }
}

