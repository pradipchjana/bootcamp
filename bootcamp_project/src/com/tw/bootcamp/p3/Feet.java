package com.tw.bootcamp.p3;

import java.util.Objects;

public class Feet {
    private final Double value;
    private final Double CORRESPONDING_INCH_VALUE = 12.0;

    public Feet(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Objects.equals(value, feet.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Boolean isEqual(Inch inch) {
        Inch correnspondingInch = new Inch(this.value * this.CORRESPONDING_INCH_VALUE);
        return inch.equals(correnspondingInch);
    }
}
