package com.tw.bootcamp.p3;

import java.util.Objects;

public class MeasurementUnit {
    final Double value;

    public MeasurementUnit(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;

        return Math.abs(this.value - length.value) < 0.001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
