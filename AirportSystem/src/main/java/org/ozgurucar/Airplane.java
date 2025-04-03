package org.ozgurucar;

import java.util.ArrayList;
import java.util.List;

public class Airplane implements Flight{
    private String tailCode;
    private boolean isInFlight;
    private String currentAirport;
    private double lattitude;
    private double longtitude;
    List<Pilot> pilots = new ArrayList<Pilot>(2);
    List<CabinStaff> cabinCrew = new ArrayList<CabinStaff>();
    private int fuelQuantity;
    private int passengerCapacity;
    private int currentPassengers;

    @Override
    public void makeFlight() {

    }

    @Override
    public int[] getPlaneLocation() {
        return new int[0];
    }

    @Override
    public void makeAnnouncement() {

    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }
}
