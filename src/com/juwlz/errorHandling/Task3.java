package com.juwlz.errorHandling;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = {"Lisa", "Rasmus", "Anton", "Romans", "Ludvig", "Pudvig", "Snudvig", "Fludvig", "Häst", "Ko"};
        int name = 1;
        boolean progress = false;

        while (!progress) {
            try {
                progress = true;
                System.out.println("What name would you like to see? ");
                name = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.err.println("The index is only " + names.length + " names long.");
                progress = false;
                input.nextLine();
            }
        }
        System.out.println(names[name]);
    }
}
