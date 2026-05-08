package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldAddCar(){
        ParkingLot parkingLot = new ParkingLot(10);
        assertTrue(parkingLot.parkCar("c1"));
    }

}