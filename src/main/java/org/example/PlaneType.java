package org.example;

public enum PlaneType {
    BOEING747(467, 124000),
    AIRBUSA330(210,65000),
    DORNIER228(19, 2000);

    private int capacity;
    private int weight;

    PlaneType(int capacity, int weight) {

        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight(){
        return weight;
    }
}
