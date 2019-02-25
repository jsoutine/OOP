package com.juwlz.errorHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean proceed = false;
        double number1 = 0, number2 = 0, result = 0;


        while (!proceed) {
            try {
                System.out.println("Write a number: ");
                number1 = input.nextInt();
                System.out.println("Now another: ");
                number2 = input.nextInt();
                proceed = true;
            } catch (InputMismatchException e) {
                System.err.println("You may only use numbers: ");
                proceed = false;
                input.nextLine();
            }
        }
        try {
        result = number1 / number2;
        } catch (ArithmeticException e) {
           System.out.println("DON'T DIVIDE BY ZERO");
           return;
        }
        System.out.println("Cool, the result is: " + result);
    }
}
