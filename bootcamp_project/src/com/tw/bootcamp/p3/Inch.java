package com.tw.bootcamp.p3;

import java.util.Objects;

public class Inch {
    private static final Double CORRESPONDING_INCH_VALUE = 0.0833333;
    private final Double value;

    public Inch(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Objects.equals(value, inch.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Boolean isEqual(Feet ft) {
        Inch correnspondingInch = new Inch(this.value * this.CORRESPONDING_INCH_VALUE);
        return ft.equals(correnspondingInch);
    }
}
