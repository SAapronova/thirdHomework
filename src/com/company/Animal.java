package com.company;

public abstract class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    abstract  void makeNoise();
    abstract  void eat();
    abstract  void sleep();


}
