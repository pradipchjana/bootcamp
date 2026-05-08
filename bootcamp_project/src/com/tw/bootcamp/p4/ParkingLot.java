package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
    private final int size;
    private final ArrayList<String> area;

    private ParkingLot(int size) {
        this.size = size;
        this.area = new ArrayList<>(size);
    }

    public static ParkingLot createParkingLot(int size) throws InvalidParkingLotSizeException {
        if(size < 0){
            throw new InvalidParkingLotSizeException("Illegal Capacity");
        }
        return new ParkingLot(size);
    }


    public boolean parkCar(String car) {
        return area.add(car);
    }


    public boolean isFull() {
        long totalCarCount = area.size();
        return totalCarCount == size;
    }
}
