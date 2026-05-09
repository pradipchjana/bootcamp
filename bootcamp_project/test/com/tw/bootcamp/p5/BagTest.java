package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddTheBallToBag(){
        Bag bag = new Bag(12);
        assertTrue(bag.addBallToBag());
    }
    @Test
    void shouldNotAddTheBallToBag(){
        Bag bag = new Bag(0);
        assertFalse(bag.addBallToBag());
    }

}