package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldReturnTrueFor1FeetAnd12Inch() {
        Length feet = Length.createFeet(1.0);
        Length inch = Length.createInch(12.0);
        assertEquals(feet, inch);
    }

    @Test
    void shouldReturnTrueFor2InchAnd5Centimeters() {
        Length centiMeter = Length.createCentiMeter(5.0);
        Length inch = Length.createInch(2.0);
        assertEquals(centiMeter, inch);
    }

    @Test
    void shouldThrowErrorForInValidUnit() {
        assertThrows(IllegalUnitException.class,()->Length.createLength(5.0,"Something"));
    }
}