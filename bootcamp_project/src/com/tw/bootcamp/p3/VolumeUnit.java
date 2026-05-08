package com.tw.bootcamp.p3;

public enum VolumeUnit {
    GALLON(3.78),LITER(1.0);

    private final double standardThreshold;

    VolumeUnit(double value) {
        this.standardThreshold = value;
    }
    Double convertToBase(Double value){
        return this.standardThreshold*value;
    }

}
