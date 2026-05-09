package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddTheBallToBag(){
        Bag bag = new Bag(12);
        assertTrue(bag.addBallToBag(Ball.BLUE));
    }
    @Test
    void shouldNotAddTheBallToBag(){
        Bag bag = new Bag(0);
        assertFalse(bag.addBallToBag(Ball.BLUE));
    }
    @Test
    void shouldAddDifferentColorInBag(){
        Bag bag1 = new Bag(12);
        Bag bag2 = new Bag(12);
        assertTrue(bag1.addBallToBag(Ball.BLUE));
        assertTrue(bag1.addBallToBag(Ball.RED));
        assertTrue(bag2.addBallToBag(Ball.BLUE));
        assertTrue(bag2.addBallToBag(Ball.RED));
        assertEquals(bag1,bag2);
    }

    @Test
    void shouldNotEqualIfContainDifferentValues(){
        Bag bag1 = new Bag(12);
        Bag bag2 = new Bag(12);
        assertTrue(bag1.addBallToBag(Ball.BLUE));
        assertTrue(bag1.addBallToBag(Ball.RED));
        assertTrue(bag2.addBallToBag(Ball.BLUE));
        assertTrue(bag2.addBallToBag(Ball.YELLOW));
        assertNotEquals(bag1,bag2);
    }


}