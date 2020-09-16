package com.company;

public class Dog extends Animal {
    protected int commands; //знание количества команд

    public Dog(String food, String location, int commands) {
        super(food, location);
        this.commands = commands;
    }

    @Override
    void makeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    void eat() {
        System.out.print("Собака кушает");
    }

    @Override
    void sleep() {
        System.out.print(" и собака спит");
    }

}
