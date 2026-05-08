package com.tw.bootcamp.p3;

public enum TemperatureUnit {
    CELSIUS,KELVIN, FAHRENHEIT;

    Double convertToBase(Double value) {
        return switch (this) {
            case CELSIUS -> value;
            case KELVIN ->  value - 273;
            case FAHRENHEIT -> (value - 32) * 5/9;
        };
    }
}

