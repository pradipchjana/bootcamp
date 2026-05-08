package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void twoInchObjectsShouldbeEqual(){
        assertEquals(new Inch(1.0), new Inch(1.0));
    }

}