package com.tw.bootcamp.p1;

public class Rectangle implements Polygon {
    private final Double length;
    private final Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double area(){
        return length * width;
    }

    @Override
    public Double perimeter() {
        return 2*(length+width);
    }
}
