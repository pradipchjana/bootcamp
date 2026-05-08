package com.tw.bootcamp.p3;
import java.util.Objects;

public class Length {
    private final Double value;
    private final LengthUnit unit;


    private Length(Double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createLength(Double value, LengthUnit unit) {
        return new Length(value,unit);
    }
    public static Length createInch(Double value) {
        return createLength(value, LengthUnit.INCH);
    }
    public static Length createFeet(Double value) {
        return createLength(value, LengthUnit.FEET);
    }

    public static Length createCentiMeter(double value) {
        return createLength(value, LengthUnit.CM);

    }

    public static Length createMilliMeter(double value) {
        return createLength(value, LengthUnit.MM);

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;

        return unit.convertToBase(this.value) - length.unit.convertToBase(length.value) < 0.00001;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
