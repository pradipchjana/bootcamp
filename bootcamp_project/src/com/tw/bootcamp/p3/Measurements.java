package com.tw.bootcamp.p3;

public class Measurements<T extends Unit> {
    private final Double value;

    public Measurements(Double value) {
        this.value = value;
    }
}
