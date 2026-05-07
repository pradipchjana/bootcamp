package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldReturnArea() {
        Square square = new Square(10.0);
        assertEquals(100.0,square.area(),0.0);
    }

    @Test
    void shouldReturnPerimeter() {
        Square square = new Square(10.0);
        assertEquals(40.0,square.perimeter(),0.0);
    }
}