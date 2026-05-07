package com.tw.bootcamp.p1;
public class Square implements Polygon{
    private final Double side;

    public Square(Double side) {
        this.side = side;
    }


    @Override
    public Double area() {
        return side*side;
    }

    @Override
    public Double perimeter() {
        return 4*side;
    }
}
