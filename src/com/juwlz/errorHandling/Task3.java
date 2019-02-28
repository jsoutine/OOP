package com.juwlz.errorHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = {"Lisa", "Rasmus", "Anton", "Romans", "Ludvig", "Pudvig", "Snudvig", "Fludvig", "Häst", "Ko"};
        int name;
        boolean progress = false;

        while (!progress) {
            try {
                progress = true;
                System.out.println("What name would you like to see? ");
                name = input.nextInt();
                System.out.println(names[name]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("The index is only " + names.length + " names long.");
                progress = false;
                input.nextLine();
            } catch ( InputMismatchException e){
                System.err.println("Use numbers moron.");
                progress = false;
                input.nextLine();
            }
        }
    }
}
