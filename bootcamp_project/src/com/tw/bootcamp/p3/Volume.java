package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume extends MeasurementUnit{

    private Volume(Double value) {
        super(value);
    }

    public static Volume createVolume(Double value, VolumeUnit unit) {
        return new Volume(unit.convertToBase(value));
    }

    public Volume add(Volume volume){
        Double total = this.value +volume.value;
        return createVolume(total,VolumeUnit.STANDARD);
    }
}

