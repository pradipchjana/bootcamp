package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinFlipTest {
 @Test
    void shouldProbabilityOfGettingTail(){
     CoinFlip coinFlip = new CoinFlip();
     assertEquals(0.5,coinFlip.probabilityOfTail(),0.0);
 }
}