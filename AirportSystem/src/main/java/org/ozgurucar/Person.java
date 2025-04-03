package org.ozgurucar;

import java.util.ArrayList;
import java.util.List;

abstract class Person {
    static List<Person> personList = new ArrayList<Person>();
    static int peopleCount = 0;
    int ID;
    String name;
    String surname;
    String title;

    Person(String name, String surname) {
        this.ID = peopleCount++;
        personList.add(this);
        this.name = name;
        this.surname = surname;
    }

    public void showInfo() {
        System.out.println("ID: " + this.ID + " Name: " + name + " Surname: " + surname + " Title: " + title);
    }
}
