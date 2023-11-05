package org.example;

public abstract class Staff {

    private String name;
    private RankType rankType;

    public Staff(String name, RankType rankType) {
        this.name = name;
        this.rankType = rankType;
    }

    public String getName() {
        return name;
    }

    public RankType getRankType() {
        return rankType;
    }
}
