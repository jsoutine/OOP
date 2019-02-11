package com.juwlz.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Person implements ActionListener {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(name);
    }
}
