package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldReturnTrueFor1FeetAnd12Inch() {
        Length feet = Length.createLength(1.0,LengthUnit.FEET);
        Length inch = Length.createLength(12.0,LengthUnit.INCH);
        assertEquals(feet, inch);
    }

    @Test
    void shouldReturnTrueFor2InchAnd5Centimeters() {
        Length centiMeter = Length.createLength(5.0,LengthUnit.CM);
        Length inch = Length.createLength(2.0,LengthUnit.INCH);
        assertEquals(centiMeter, inch);
    }

    @Test
    void shouldReturnTrueFor1CentimeterAnd10Millimeter() {
        Length centiMeter = Length.createLength(1.0,LengthUnit.CM);
        Length milliMeter = Length.createLength(10.0,LengthUnit.MM);
        assertEquals(centiMeter, milliMeter);
    }
    @Test
    void shouldAddTwoLengthsWithSameUnits(){
        Length value1 = Length.createLength(2.0,LengthUnit.INCH);
        Length value2 = Length.createLength(2.0,LengthUnit.INCH);
        assertEquals(Length.createLength(4.0,LengthUnit.INCH),value1.add(value2));

    }

    @Test
    void shouldAddTwoLengthsWithDiffrentUnits(){
        Length value1 = Length.createLength(2.0,LengthUnit.INCH);
        Length value2 = Length.createLength(2.5,LengthUnit.CM);
        assertEquals(Length.createLength(3.0,LengthUnit.INCH),value1.add(value2));

    }

}