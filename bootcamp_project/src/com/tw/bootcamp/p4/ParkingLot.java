package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
    private final int size;
    private final ArrayList<String> area;

    public ParkingLot(int size) {
        this.size = size;
        this.area = new ArrayList<String>(size);
    }


    public boolean parkCar(String car) {
        return area.add(car);
    }
}
