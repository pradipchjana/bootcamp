package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
 @Test
    void shouldProbabilityOfGettingTail(){
     Chance chanceOfGettingTail = Chance.createChance(0.5);
     assertEquals(0.5,chanceOfGettingTail.get(),0.0);
 }

    @Test
    void shouldProbabilityOfNotGettingTail(){
        Chance chanceOfGettingTail = Chance.createChance(0.5);
        assertEquals(0.5,chanceOfGettingTail.not(),0.0);
    }

    @Test
    void shouldProbabilityOfNotGettingTailInTwoCoins(){
        Chance probability = Chance.createChance(0.75);
        assertEquals(0.75,probability.get(),0.0);
    }

    @Test
    void shouldProbabilityOfGettingThreeInCube(){
        Chance probability = Chance.createChance(0.167);
        assertEquals(0.167,probability.get(),0.0);
    }
    @Test
    void shouldThrowError(){
        assertThrows(IllegalArgumentException.class,() -> Chance.createChance(-0.167),"Chance always be 0-1");
    }
}