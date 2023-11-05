package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private LocalTime departureTime;
    private ArrayList<Integer> seatNumbers;

    public Flight(String flightNumber, String destination, String departureAirport, LocalTime departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.seatNumbers = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int NumberOfPassengersOnBoard(){
        return passengers.size();
    }

    public void addPlane(Plane plane) {
        this.plane = plane;
        createSeatNumbers();
    }

    public Plane getPlane() { return plane; }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

//    public void setDepartureTime(int hour, int minute){
//        this.departureTime = LocalTime.of(hour, minute);
//    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public String addPassenger(Passenger passenger){                    // books a seat on the flight for a passenger, returns a string if flight is full
        if (plane.getPlaneType().getCapacity() > passengers.size()){   //assigns the flight number to the passengers
            this.passengers.add(passenger);                           //assigns a seat to each passenger
            passenger.setFlight(flightNumber);
            Integer number = seatNumbers.remove(0);
            passenger.setSeatNumber(number);
            return "Passenger added successfully, assigned to seat " + passenger.getSeatNumber() + ".";

        } else {
            return "Sorry, this flight is full.";

        }

    }

    public int availableSeats(){                                           // renders available number of seats
        return plane.getPlaneType().getCapacity() - passengers.size();
    }

    public Boolean teamOnBoard(){                                           // check for min. required number of crew on board
        if(pilots.size() == 2 && cabinCrewMembers.size() > 3){
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getSeatNumbers() {
        return seatNumbers;
    }

    public void createSeatNumbers(){                                   //creates an array of numbers in a random order
        for (int i = 1; i <= plane.getPlaneType().getCapacity(); i++) {

            seatNumbers.add(i);
        }
        Collections.shuffle(seatNumbers);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
