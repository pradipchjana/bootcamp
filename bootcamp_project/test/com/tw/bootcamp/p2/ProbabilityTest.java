package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
 @Test
    void shouldProbabilityOfGettingTail(){
     Chance chanceOfGettingTail = new Chance(0.5);
     assertEquals(0.5,chanceOfGettingTail.getChance(),0.0);
 }

    @Test
    void shouldProbabilityOfNotGettingTail(){
        Chance chanceOfGettingTail = new Chance(0.5);
        assertEquals(0.5,chanceOfGettingTail.notGetting(),0.0);
    }

    @Test
    void shouldProbabilityOfNotGettingTailInTwoCoins(){
        Chance probability = new Chance(0.75);
        assertEquals(0.75,probability.getChance(),0.0);
    }
}