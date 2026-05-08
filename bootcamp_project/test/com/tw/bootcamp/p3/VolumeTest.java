package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldReturnTrueFor1FeetAnd12Inch() {
        Volume gallon = Volume.createGallon(1.0);
        Volume liters = Volume.createLiters(3.78);
        assertEquals(gallon, liters);
    }

}