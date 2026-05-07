package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
 @Test
    void shouldProbabilityOfGettingTail(){
     Chance chanceOfGettingTail = Chance.createChance(0.5);
     assertEquals(Chance.createChance(0.5),chanceOfGettingTail);
 }

    @Test
    void shouldProbabilityOfNotGettingTail(){
        Chance chanceOfGettingTail = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.5),chanceOfGettingTail.not());
    }

    @Test
    void shouldProbabilityOfNotGettingTailInTwoCoins(){
        Chance probability = Chance.createChance(0.75);
        assertEquals(Chance.createChance(0.75),probability);
    }

    @Test
    void shouldProbabilityOfGettingThreeInCube(){
        Chance probability = Chance.createChance(0.167);
        assertEquals(Chance.createChance(0.75),probability);
    }
    @Test
    void shouldThrowError(){
        assertThrows(IllegalArgumentException.class,() -> Chance.createChance(-0.167),"Chance always be 0-1");
    }
}