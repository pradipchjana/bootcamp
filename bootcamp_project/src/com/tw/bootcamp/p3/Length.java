package com.tw.bootcamp.p3;
import java.util.Objects;

public class Length {
    private static final Double CM_TO_METER = 0.01;
    private static final Double MM_TO_METER = 0.001;
    private final Double value;
    private final Unit unit;
    private  final Double INCH_TO_METER = 0.0254;
    private final Double FEET_TO_METER = 0.3048;

    private Length(Double value,Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createLength(Double value,Unit unit) {
        return new Length(value,unit);
    }
    public static Length createInch(Double value) {
        return createLength(value,Unit.INCH);
    }
    public static Length createFeet(Double value) {
        return createLength(value,Unit.FEET);
    }

    public static Length createCentiMeter(double value) {
        return createLength(value,Unit.CM);

    }

    public static Length createMilliMeter(double value) {
        return createLength(value,Unit.MM);

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;

        return toMeter() - length.toMeter() < 0.00001;
    }

    public Double toMeter() throws IllegalUnitException{
        return switch (this.unit) {
            case Unit.INCH -> this.value * this.INCH_TO_METER;
            case Unit.FEET -> this.value * this.FEET_TO_METER;
            case Unit.CM -> this.value * this.CM_TO_METER;
            case Unit.MM -> this.value * this.MM_TO_METER;

            default -> throw new IllegalUnitException("Invalid Unit");
        };
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
