package com.tw.bootcamp.p3;

import java.util.function.UnaryOperator;

public enum TemperatureUnit {
    CELSIUS((c)->c),
    KELVIN((k)->k-273),
    FAHRENHEIT((f)-> (f - 32) * 5.0/9 );

    private final UnaryOperator<Double> action;

    TemperatureUnit(UnaryOperator<Double> action) {
        this.action = action;
    }

    Double convertToBase(Double value) {
        return this.action.apply(value);
    }
}

