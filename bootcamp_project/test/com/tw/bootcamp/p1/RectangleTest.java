package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnAreaOfRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(2.0, 5.0);
        assertEquals(10.0,rectangle.area(),0.01);
    }
    @Test
    void shouldReturnPerimeterOfRectangle(){
        Rectangle rectangle = Rectangle.createRectangle(2.0, 3.0);
        assertEquals(10.0,rectangle.perimeter(),0.01);
    }

    @Test
    void shouldReturnAreaOfSquare() {
        Rectangle square = Rectangle.createSquare(10.0);
        assertEquals(100.0,square.area(),0.0);
    }

    @Test
    void shouldReturnPerimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(10.0);
        assertEquals(40.0,square.perimeter(),0.0);
    }
}