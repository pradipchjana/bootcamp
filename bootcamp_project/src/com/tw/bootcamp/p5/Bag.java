package com.tw.bootcamp.p5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bag {
    private final int capacity;
    private int numberOfBalls = 0;
    private final Map<Ball,Integer> coloredBalls = new HashMap<>();

    public Bag(int capacity) {
        this.capacity = capacity;
    }
    public boolean addBallToBag(Ball color){
        coloredBalls.compute(color,(_,v)->(v==null)?1:v+1);
        numberOfBalls++;
        return this.numberOfBalls < capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return capacity == bag.capacity && numberOfBalls == bag.numberOfBalls && Objects.equals(coloredBalls, bag.coloredBalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, numberOfBalls, coloredBalls);
    }
}
