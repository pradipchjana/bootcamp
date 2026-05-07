package com.tw.bootcamp.p1;

public class Rectangle  {
    private final Double length;
    private final Double width;

     private Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle createRectangle(Double length, Double width) {
        return new Rectangle(length, width);
    }

    public static Rectangle createSquare(Double side) {
        return createRectangle(side,side);
    }

    public Double area(){
        return length * width;
    }

    public Double perimeter() {
        return 2*(length+width);
    }
}
