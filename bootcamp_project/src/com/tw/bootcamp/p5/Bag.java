package com.tw.bootcamp.p5;

public class Bag {
    private final int capacity;
    private int numberOfBalls =0;

    public Bag(int capacity) {
        this.capacity = capacity;
    }
    public boolean addBallToBag(){
        this.numberOfBalls++;
        return this.numberOfBalls < capacity;
    }
}
