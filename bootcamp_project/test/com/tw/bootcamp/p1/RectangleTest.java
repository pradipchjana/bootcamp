package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(2.0, 5.0);
        assertEquals(10.0,rectangle.area(),0.01);
    }
    @Test
    void shouldReturnPerimeterOfRectangle(){
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        assertEquals(10.0,rectangle.perimeter(),0.01);
    }
}