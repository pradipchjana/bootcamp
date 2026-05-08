package com.tw.bootcamp.p3;

public enum VolumeUnit implements Unit {
    GALLON(3.78),LITER(1.0), STANDARD(1.0);

    private final double standardThreshold;

    VolumeUnit(double value) {
        this.standardThreshold = value;
    }
    public Double convertToBase(Double value){
        return this.standardThreshold*value;
    }

}
