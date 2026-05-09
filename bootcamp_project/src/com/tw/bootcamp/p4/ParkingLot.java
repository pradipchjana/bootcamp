package com.tw.bootcamp.p4;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingLot that = (ParkingLot) o;
        return size == that.size && Objects.equals(area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, area);
    }
}
