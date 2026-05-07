package com.tw.bootcamp.p1;

public class Rectangle{
    private final Double length;
    private final Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double area(){
        return length * width;
    }
}
