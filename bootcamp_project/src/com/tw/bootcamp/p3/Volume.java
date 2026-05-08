package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {
    private static final Double GALLON_TO_LITER = 3.78;
    private final Double value;
    private final VolumeUnit unit;

    private Volume(Double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume createGallon(double value) {
        return createVolume(value, VolumeUnit.GALLON);
    }

    public static Volume createVolume(Double value, VolumeUnit unit) {
        return new Volume(value, unit);
    }

    public static Volume createLiters(double value) {
        return createVolume(value, VolumeUnit.LITER);
    }
    public Double toLiter() throws IllegalUnitException{
        return switch (this.unit) {
            case VolumeUnit.GALLON -> this.value * GALLON_TO_LITER;
            case VolumeUnit.LITER -> this.value * 1;
            default -> throw new IllegalUnitException("Invalid Unit");
        };
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Math.abs(toLiter() - volume.toLiter()) < 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}

