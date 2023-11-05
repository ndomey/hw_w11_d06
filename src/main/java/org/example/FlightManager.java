package org.example;

public class FlightManager {
    private Flight flight;



    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double baggageWeightAllowance(){
        return flight.getPlane().getPlaneType().getWeight() / (2 * flight.getPlane().getPlaneType().getCapacity());
    }

    public double passengersBaggageWeight(){
        return baggageWeightAllowance()  * flight.NumberOfPassengersOnBoard();
    }

    public double remainingCargoCapacity(){
        return flight.getPlane().getPlaneType().getWeight() / 2 - passengersBaggageWeight();
    }
}
