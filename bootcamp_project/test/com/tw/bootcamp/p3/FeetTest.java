package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void twoFeetObjectsShouldbeEqual(){
        assertEquals(new Feet(1.0), new Feet(1.0));
    }

    @Test
    void shouldCheckToOtherType(){
        Feet feet = new Feet(2.0);
        Inch inch = new Inch(24.0);
        assertTrue(feet.isEqual(inch));
    }

}