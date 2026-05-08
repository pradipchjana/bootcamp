package com.tw.bootcamp.p3;

import java.util.Objects;

public class Temperature {
    private final Double value;

    private Temperature(Double value) {
        this.value = value;
    }

    public static Temperature createTemperature(Double value,TemperatureUnit unit) {
        return new Temperature(unit.convertToBase(value));
    }
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Temperature temperature = (Temperature) o;
        return Math.abs(this.value - temperature.value) < 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

}
