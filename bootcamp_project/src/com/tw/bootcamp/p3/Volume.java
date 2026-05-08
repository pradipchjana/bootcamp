package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {
    private final Double value;

    private Volume(Double value) {
        this.value = value;
    }

    public static Volume createVolume(Double value, VolumeUnit unit) {
        return new Volume(unit.convertToBase(value));
    }

    public Volume add(Volume volume){
        Double total = this.value +volume.value;
        return createVolume(total,VolumeUnit.STANDARD);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Math.abs(this.value - volume.value) < 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}

