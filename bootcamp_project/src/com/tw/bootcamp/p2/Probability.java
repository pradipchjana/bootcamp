package com.tw.bootcamp.p2;

import java.util.Objects;

public class Probability {
    private final Double chance;

    private Probability(Double chance) {
        this.chance = chance;
    }


    public static Probability createProbability(Double chance) throws ImpossibleProbabilityCreationException {
        if (chance > 1 || chance < 0){
            throw new ImpossibleProbabilityCreationException("Chance always be 0-1");
        }
        return new Probability(chance);
    }

    public Probability not(){
        return createProbability(1 - chance);
    }

    public Probability and(Probability otherChance){
        return createProbability(multiply(otherChance));
    }

    private double multiply(Probability otherChance) {
        return this.chance * otherChance.chance;
    }

    public Probability or(Probability otherChance) {
     return createProbability(add(otherChance) - multiply(otherChance));
//        return  this.not().and(otherChance.not()).not();
    }

    private double add(Probability otherChance) {
        return this.chance + otherChance.chance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability chance1 = (Probability) o;
        return Objects.equals(chance, chance1.chance);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }
}
