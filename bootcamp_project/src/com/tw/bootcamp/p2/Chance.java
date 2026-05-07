package com.tw.bootcamp.p2;

public class Chance {
    private final Double chance;

    public Chance(Double chance) {
        this.chance = chance;
    }

    public Double getChance() {
        return chance;
    }

    public Double notGetting(){
        return 1- chance;
    }
}
