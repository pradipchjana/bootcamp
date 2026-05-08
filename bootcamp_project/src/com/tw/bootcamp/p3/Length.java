package com.tw.bootcamp.p3;
import java.util.Objects;

public class Length {
    private static final Double CM_TO_METER = 0.01;
    private final Double value;
    private final String unit;
    private  final Double INCH_TO_METER = 0.0254;
    private final Double FEET_TO_METER = 0.3048;

    private Length(Double value,String unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createLength(Double value,String unit) {
        return new Length(value,unit);
    }
    public static Length createInch(Double value) {
        return createLength(value,"INCH");
    }
    public static Length createFeet(Double value) {
        return createLength(value,"FEET");
    }

    public static Length createCentiMeter(double value) {
        return createLength(value,"CM");

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;

        return toMeter() - length.toMeter() < 0.00001;
    }

    public Double toMeter() throws IllegalUnitException{
        return switch (this.unit) {
            case "INCH" -> this.value * this.INCH_TO_METER;
            case "FEET" -> this.value * this.FEET_TO_METER;
            case "CM" -> this.value * this.CM_TO_METER;

            default -> throw new IllegalUnitException("Invalid Unit");
        };
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
