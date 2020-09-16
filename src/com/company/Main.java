package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Homework class Phone
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(991574518, "Sergo");
        Phone phone3 = new Phone(991574516, "Bill", 300);

        phone1.receiveCall("Маша");
        phone1.receiveCall("Маша", phone1.getNumber());

        System.out.println(phone2.getNumber());
        phone2.receiveCall("Паша");
        phone2.receiveCall("Паша", phone2.getNumber());

        System.out.println(phone3.getNumber());
        phone3.receiveCall("Даша");
        phone3.receiveCall("Даша", phone3.getNumber());

        //Homework class Animal
        Veterinarian vet = new Veterinarian();

        Animal[] animals = new Animal[3];
        animals[0] = new Cat(" рыбку", " в доме", 4);
        animals[1] = new Dog(" корм", " в будке", 3);
        animals[2] = new Horse(" сено", " загоне", true);

        for (int i = 0; i < 3; i++) {
            vet.threatAnimal(animals[i]);
        }

        //Student
        Student[] students = new Student[2];
        Student aspirant = new Aspirant("Мария", "Александрова", "13-А-ПР2",
                5, "Научная работа");
        students[0] = aspirant;
        students[1] = new Student("Александр", "Каспаров", "14-К-ПИ1", 3.5);
        System.out.println("Аспирант " + students[0].firstName + " " + students[0].lastName + " имеет стипендию в размере "
                + students[0].getScholarship());
        System.out.println("Студент " + students[1].firstName + " " + students[1].lastName + " имеет стипендию в размере "
                + students[1].getScholarship());



    }
}
