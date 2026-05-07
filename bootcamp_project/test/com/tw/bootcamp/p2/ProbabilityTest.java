package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
 @Test
    void shouldProbabilityOfGettingTail(){
     Probability chanceOfGettingTail = Probability.createChance(0.5);
     assertEquals(Probability.createChance(0.5),chanceOfGettingTail);
 }

    @Test
    void shouldProbabilityOfNotGettingTail(){
        Probability chanceOfGettingTail = Probability.createChance(0.5);
        assertEquals(Probability.createChance(0.5),chanceOfGettingTail.not());
    }

    @Test
    void shouldProbabilityOfNotGettingTailInTwoCoins(){
        Probability chance = Probability.createChance(0.5);
        Probability otherChance = Probability.createChance(0.5);
        assertEquals(Probability.createChance(0.25),chance.and(otherChance));
    }

    @Test
    void shouldProbabilityOfGettingThreeInCube(){
        Probability probability = Probability.createChance(0.167);
        assertEquals(Probability.createChance(0.75),probability);
    }
    @Test
    void shouldProbabilityOfGettingAtleastOneTailInTwoCoins(){
        Probability chance = Probability.createChance(0.5);
        Probability otherChance = Probability.createChance(0.5);
        assertEquals(Probability.createChance(0.75),chance.or(otherChance));
    }

    @Test
    void shouldThrowError(){
        assertThrows(IllegalArgumentException.class,() -> Probability.createChance(-0.167),"Chance always be 0-1");
    }
}