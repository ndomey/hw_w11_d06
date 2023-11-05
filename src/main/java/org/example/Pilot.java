package org.example;

public class Pilot extends Staff {

    private String pilotLicenceNumber;

    public Pilot(String name, RankType rankType, String pilotLicenceNumber) {
        super(name, rankType);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String takeOff(Flight flight){
        Plane planeAssigned = flight.getPlane();
        Boolean crewOnBoard = flight.teamOnBoard();

        if(planeAssigned != null && crewOnBoard == true){
            return "Prepare for taking off!";
        }
        return "Attention! Cannot take off without the required crew members!";
    }
}
