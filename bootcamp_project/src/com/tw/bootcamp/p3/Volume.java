package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {
    private final Double value;
    private final VolumeUnit unit;

    private Volume(Double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume createVolume(Double value, VolumeUnit unit) {
        return new Volume(value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Math.abs(this.unit.convertToBase(this.value) - volume.unit.convertToBase(volume.value)) < 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}

