package com.juwlz.observer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TimerObserverExample {

    public static void main(String[] args) {
        //Creating observers
        Person myObserver1 = new Person("Christian");
        Person myObserver2 = new Person("Anna");
        Person myObserver3 = new Person("Torvald");

        //Creating a timer that will elapse in 2 seconds.
        Timer timer = new Timer(2000, myObserver1);

        timer.addActionListener((ActionListener) myObserver2);
        timer.addActionListener((ActionListener) myObserver3);

        timer.start();

        while(true);
    }
}
