package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldReturnTrueFor1FeetAnd12Inch() {
        Volume gallon = Volume.createVolume(1.0,VolumeUnit.GALLON);
        Volume liters = Volume.createVolume(3.78,VolumeUnit.LITER);
        assertEquals(gallon, liters);
    }

}