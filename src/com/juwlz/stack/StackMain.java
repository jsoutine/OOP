package com.juwlz.stack;

import java.util.*;

public class StackMain {

    public static void main(String[] args) {
        StackMain myApp = new StackMain();

        myApp.stack();
        myApp.queue();
        myApp.hashMap();
        myApp.hasMap2();
    }

    private void stack(){
    System.out.println("--- Stack: push/pop ---");
    Stack<String> myStack = new Stack<>();
        myStack.push("Stack: Ace of Spades");
        myStack.push("Stack: Queen of Hearts");
        System.out.println("Content is: " + myStack);
        System.out.println("Top is: " + myStack.pop());
        System.out.println();
    }

    private void queue(){
        System.out.println("--- Queue: offer/poll ---");
        Queue<String> queue = new LinkedList<>();
        queue.offer("First in line");
        queue.offer("Second in line");
        System.out.println("Polled from head: " + queue.poll());
        System.out.println("Contents: " + queue);
        System.out.println();
    }

    private void hashMap(){
        System.out.println("--- HashMap: put/get ---");
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Ann Johnsson", 23);
        int value = myMap.get("Ann Johnsson");
        System.out.println("Hashmap, retrieved: " + value);
        System.out.println();
    }

    private void hasMap2(){
        System.out.println("--- Another Hashmap ---");
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("Kenny", true);
        map.put("Joe", false);
        System.out.println(map.get("Kenny"));

        if(map.containsKey("Jack")){
            System.out.println(1);
        }

        if(map.containsValue(Boolean.FALSE)){
            System.out.println(2);
        }
        for(String s: map.keySet()){
            System.out.println(3);
        }
        for(Boolean b :map.values()){
            System.out.println(4);
        }
        for(Map.Entry kv : map.entrySet()){

        }
    }
}
