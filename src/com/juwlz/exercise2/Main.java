package com.juwlz.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Anna", 20);
        Person person2 = new Person("Kalle", 30);
        Person person3 = new Person("Bodil", 50);

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3));

        Collections.sort(people);

        for (Person aPeople : people) {
            System.out.println(aPeople);
        }
    }
}
