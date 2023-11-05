package org.example;

public class CabinCrewMember extends Staff {

    public CabinCrewMember(String name, RankType rankType) {
        super(name, rankType);
    }

    public String inflightPassengerAnnouncement(){
        return "Ladies and gentlemen, the Captain has turned on the fasten seat belt sign. " +
                "We are now crossing a zone of turbulence." +
                "Please return your seats and keep your seat belts fastened. Thank you.";

    }
}
