package com.juwlz.exercise2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Anna", 20);
        Person person2 = new Person("Kalle", 50);
        Person person3 = new Person("Bodil", 30);

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3));

        System.out.println(people.get(1).getName());
    }
}
