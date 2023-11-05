package org.example;

public class Passenger {

    private String name;
    private int numOfBags;
    private String flight;
    private int seatNumber;

    public Passenger(String name, int numOfBags) {
        this.name = name;
        this.numOfBags = numOfBags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getFlight() {
        return flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
