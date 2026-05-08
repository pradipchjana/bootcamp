package com.tw.bootcamp.p3;

public enum LengthUnit implements Unit{
    INCH(0.0254),
    FEET(0.3048),
    CM(0.01),
    MM(0.001),
    METER(1.0),
    STANDARD(1.0);

    private final Double standardThreshold;
    LengthUnit(Double standardThreshold){
     this.standardThreshold =standardThreshold;
    }
    public Double convertToBase(Double value){
        return this.standardThreshold*value;
    }
}
