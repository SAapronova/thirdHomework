package com.company;

public class Aspirant extends Student{
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, String scientificWork) {
        super(firstName, lastName, group);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship(double averageMark) {
        if (averageMark==5){
            return 200;
        }
        else
            return 180;
    }
}
