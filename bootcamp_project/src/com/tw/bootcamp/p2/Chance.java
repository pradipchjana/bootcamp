package com.tw.bootcamp.p2;

public class Chance {
    private final Double chance;

    private Chance(Double chance) {
        this.chance = chance;
    }

    public static Chance createChance(Double chance) {
        if (chance > 1 || chance < 0){
            throw new IllegalArgumentException("Chance always be 0-1");
        }
        return new Chance(chance);
    }

    public Double get() {
        return chance;
    }

    public Double not(){
        return 1- chance;
    }
}
