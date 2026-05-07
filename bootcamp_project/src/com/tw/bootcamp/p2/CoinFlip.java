package com.tw.bootcamp.p2;

public class CoinFlip {

    public double probabilityOfTail() {
       return 0.5;
    }

    public double probabilityOfNotGettingTail() {
        return 1 - probabilityOfTail();
    }
}
