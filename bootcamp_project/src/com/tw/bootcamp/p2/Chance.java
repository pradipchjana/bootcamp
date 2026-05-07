package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {
    private final Double chance;

    private Chance(Double chance) {
        this.chance = chance;
    }

    public static Chance createChance(Double chance) throws IllegalArgumentException {
        if (chance > 1 || chance < 0){
            throw new IllegalArgumentException("Chance always be 0-1");
        }
        return new Chance(chance);
    }

    public Chance not(){
        return new Chance(1- chance);
    }

    public Chance and(Chance otherChance){
        return new Chance(multiply(otherChance));
    }

    private double multiply(Chance otherChance) {
        return this.chance * otherChance.chance;
    }

    public Chance or(Chance otherChance) {
     return new Chance(add(otherChance) - multiply(otherChance));
    }

    private double add(Chance otherChance) {
        return this.chance + otherChance.chance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance1 = (Chance) o;
        return Objects.equals(chance, chance1.chance);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }


}
