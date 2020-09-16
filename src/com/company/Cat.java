package com.company;

public class Cat extends Animal {
    protected int mouse; //количество мышей, пойманных за день

    public Cat(String food, String location, int mouse) {
        super(food, location);
        this.mouse = mouse;
    }

    @Override
    void makeNoise() {
        System.out.println("Кит, ты маму мав");
    }

    @Override
    void eat() {
        System.out.print("Кошка кушает");
    }

    @Override
    void sleep() {
        System.out.print(" и кошка спит");
    }

}
