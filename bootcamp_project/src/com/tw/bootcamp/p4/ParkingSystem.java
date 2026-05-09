package com.tw.bootcamp.p4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ParkingSystem {
    private final Map<String, ParkingLot> parkingLots = new HashMap<>();

    public void addParkingLot(String parkingLotId,int parkingLotSize){
        parkingLots.put(parkingLotId, ParkingLot.createParkingLot(parkingLotSize));
    }

    public boolean park (String parkingLotId,String carId){
        return parkingLots.get(parkingLotId).parkCar(carId);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSystem that = (ParkingSystem) o;
        return Objects.equals(parkingLots, that.parkingLots);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(parkingLots);
    }
}
