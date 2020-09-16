package com.company;

public class Horse extends Animal {
    protected boolean racehorse; //скаковая лошадь или нет

    public Horse(String food, String location, boolean racehorse) {
        super(food, location);
        this.racehorse = racehorse;
    }

    @Override
    void makeNoise() {
        System.out.println("Лошадь егого");
    }

    @Override
    void eat() {
        System.out.print("Лошадь кушает");
    }

    @Override
    void sleep() {
        System.out.print(" и лошадь спит");
    }


}
