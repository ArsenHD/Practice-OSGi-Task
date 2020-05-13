package ru.softwerke.practice.greeting.impl;

import ru.softwerke.practice.greeting.Greeting;

public class GreetingImpl implements Greeting {
    public void greet() {
        System.out.println("Hello, OSGi world!");
    }

    public void goodbye() {
        System.out.println("Goodbye!");
    }
}
