package com.juwlz.exercise2.task3;

public class Main {

    public static void main(String[] args) {

        Main myApp = new Main();
        MyTimer timer = new MyTimer();

        while(true){
            try {
                Thread.sleep(1000);
                //notify observer
                //add some code
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

}
