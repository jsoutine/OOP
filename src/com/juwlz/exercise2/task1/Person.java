package com.juwlz.exercise2.task1;

public class Person implements Comparable<Person> {

    public static boolean nameSort = true;

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person p) {

        if (nameSort){
        return name.compareTo(p.name);
        } else {
        return -age - p.age;
        }

        /*if (name.charAt(0) < p.getName().charAt(0)) {
            return -1;
        } else if (name.charAt(0) > p.getName().charAt(0)) {
            return 1;
        } else {
            return 0;
        }*/
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nAge: %d%n", name, age);
    }
}
