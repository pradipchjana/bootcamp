package com.tw.bootcamp.p3;

public class Temperature {
    private final Double value;

    private Temperature(Double value) {
        this.value = value;
    }

    public static Temperature createTemperature(Double value,TemperatureUnit unit) {
        return new Temperature(unit.convertToBase(value));
    }


}
