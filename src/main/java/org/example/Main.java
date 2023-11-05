package org.example;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CabinCrewMember aircabincrew1;
        CabinCrewMember aircabincrew2;
        CabinCrewMember aircabincrew3;
        CabinCrewMember aircabincrew4;
        Pilot pilot1;
        Pilot pilot2;
        Flight flight;
        Plane plane;
        Passenger passenger1;
        Passenger passenger2;
        Passenger passenger3;
        LocalTime departureTime;


        passenger1 = new Passenger("Chris P. Bacon", 1);
        passenger2 = new Passenger("Chris P. Baco", 1);
        passenger3 = new Passenger("Chris P. Ba", 1);
        aircabincrew1 = new CabinCrewMember("Anna Conda", RankType.FLIGHT_ATTENDANT);
        aircabincrew2 = new CabinCrewMember("Bud Wieser", RankType.FLIGHT_ATTENDANT);
        aircabincrew3 = new CabinCrewMember("Crystal Claire Waters", RankType.FLIGHT_ATTENDANT);
        aircabincrew4 = new CabinCrewMember("Holly Day", RankType.FLIGHT_ATTENDANT);
        pilot1 = new Pilot("Amelia Earhart", RankType.CAPTAIN, "AA123456");
        pilot2 = new Pilot("Erich Hartmann", RankType.FIRST_OFFICER, "BB123456");
        plane = new Plane(PlaneType.DORNIER228);
        departureTime = LocalTime.of(11,00);
        flight = new Flight("LF123" ,"LHR","EDI", departureTime);
        flight.addPlane(plane);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(aircabincrew1);
        flight.addCabinCrewMember(aircabincrew2);
        flight.addCabinCrewMember(aircabincrew3);
        flight.addCabinCrewMember(aircabincrew4);


        System.out.println(flight.addPassenger(passenger1));
        System.out.println(flight.addPassenger(passenger2));
        System.out.println(flight.addPassenger(passenger3));
        System.out.println(flight.getPassengers().get(0).getSeatNumber());
        System.out.println(flight.getPassengers().get(1).getSeatNumber());
        System.out.println(flight.getPassengers().get(2).getSeatNumber());
    }
}