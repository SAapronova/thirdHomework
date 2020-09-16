package com.company;

public class Student {

    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;

    }

    public int getScholarship(double averageMark){
        if (averageMark==5){
            return 100;
        }
        else
            return 80;

    }


}
