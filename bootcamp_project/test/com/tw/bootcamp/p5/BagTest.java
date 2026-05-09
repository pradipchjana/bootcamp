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
        assertTrue(bag1.addBallToBag(Ball.GREEN));
        assertTrue(bag1.addBallToBag(Ball.RED));
        assertTrue(bag2.addBallToBag(Ball.GREEN));
        assertTrue(bag2.addBallToBag(Ball.YELLOW));
        assertNotEquals(bag1,bag2);
    }
    @Test
    void shouldNotAllowToADDMoreThan3GreenBalls(){
        Bag bag = new Bag(12);
        bag.addBallToBag(Ball.GREEN);
        bag.addBallToBag(Ball.GREEN);
        bag.addBallToBag(Ball.GREEN);
        assertThrows(OutOfLimitException.class,()->bag.addBallToBag(Ball.GREEN));
    }
    @Test
    void shouldNotAllowToADDMoreThanRedBalls(){
        Bag bag = new Bag(12);
        bag.addBallToBag(Ball.RED);
        bag.addBallToBag(Ball.RED);
        assertThrows(OutOfLimitException.class,()->bag.addBallToBag(Ball.RED));
    }

    @Test
    void shouldNotAllowToADDMoreThan2Yellows(){
        Bag bag = new Bag(12);
        bag.addBallToBag(Ball.GREEN);
        bag.addBallToBag(Ball.GREEN);
        bag.addBallToBag(Ball.GREEN);
        bag.addBallToBag(Ball.BLUE);
        bag.addBallToBag(Ball.BLUE);
        assertTrue(bag.addBallToBag(Ball.YELLOW));
        assertTrue(bag.addBallToBag(Ball.YELLOW));
        assertFalse(bag.addBallToBag(Ball.YELLOW));
    }
    }