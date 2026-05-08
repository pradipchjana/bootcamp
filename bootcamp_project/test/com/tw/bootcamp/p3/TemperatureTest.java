package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void shouldReturnTrueFor1FeetAnd12Inch() {
        Temperature celsius = Temperature.createTemperature(100.0, TemperatureUnit.CELSIUS);
        Temperature fahrenheit = Temperature.createTemperature(212.0, TemperatureUnit.FAHRENHEIT);

        assertEquals(celsius,fahrenheit);
    }
}