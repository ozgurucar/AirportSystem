package org.ozgurucar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Pilot pl = new Pilot("Özgür","Uçar");
        pl.showInfo();
        Pilot pl1 = new Pilot("Deneme1","Deneme1");
        pl1.showInfo();

        Person.personList.get(0).showInfo();
        Passenger ps = new Passenger("Deneme2", "Deneme2");
        ps.showInfo();

        Person.personList.get(2).showInfo();

    }
}