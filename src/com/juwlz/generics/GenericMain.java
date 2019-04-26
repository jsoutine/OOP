package com.juwlz.generics;

public class GenericMain {

    public static void main(String[] args) {

        MyTest<Integer, Double> myTest1 = new MyTest<>(5,2.3);

        System.out.println();

        Integer[] iray = {1, 2, 3, 4, 5};
        Character[] cray = {'b', 'u', 'c', 'k'};

        printMe(iray);
        printMe(cray);

        System.out.println(max(42,32,43));
        System.out.println(max("apples","tots","zhicken"));


    }

    private static <T> void printMe(T[] x) {
        for (T b : x) {
            System.out.printf("%s ", b);
        }
        System.out.println();
    }

    private static <T extends Comparable<T>> T max(T a, T b, T c) {
        T m = a;

        if(b.compareTo(a) > 0){
            m = b;
        }
        if(c.compareTo(m) > 0){
            m = c;
        }
        return m;
    }
}
