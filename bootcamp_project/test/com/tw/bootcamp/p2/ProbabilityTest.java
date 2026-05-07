package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
 @Test
    void shouldProbabilityOfGettingTail(){
     Probability chanceOfGettingTail = Probability.createProbability(0.5);
     assertEquals(Probability.createProbability(0.5),chanceOfGettingTail);
 }

    @Test
    void shouldProbabilityOfNotGettingTail(){
        Probability chanceOfGettingTail = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.5),chanceOfGettingTail.not());
    }

    @Test
    void shouldProbabilityOfNotGettingTailInTwoCoins(){
        Probability chance = Probability.createProbability(0.5);
        Probability otherChance = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.25),chance.and(otherChance));
    }

    @Test
    void shouldProbabilityOfGettingThreeInCube(){
        Probability probability = Probability.createProbability(0.167);
        assertEquals(Probability.createProbability(0.167),probability);
    }

    @Test
    void shouldProbabilityOfGettingLeastOneTailInTwoCoins(){
        Probability chance = Probability.createProbability(0.5);
        Probability otherChance = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.75),chance.or(otherChance));
    }
    @Test
    void shouldThrowError(){
        assertThrows(ImpossibleProbabilityCreationException.class,() -> Probability.createProbability(-0.167),"Chance always be 0-1");
    }
}