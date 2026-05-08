package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldAddCar(){
        ParkingLot parkingLot = ParkingLot.createParkingLot(10);
        assertTrue(parkingLot.parkCar("c1"));
    }

    @Test
    void shouldReturnTrueIsLotISFull(){
        ParkingLot parkingLot = ParkingLot.createParkingLot(1);
        parkingLot.parkCar("c1");

        assertTrue(parkingLot.isFull());
    }

    @Test
    void shouldThrowTheErrorIsInvalidSize() {
         assertThrows(InvalidParkingLotSizeException.class,() -> ParkingLot.createParkingLot(-1));
    }

    @Test
    void shouldReturnFalseIsLotISNotFull(){
        ParkingLot parkingLot = ParkingLot.createParkingLot(10);
        parkingLot.parkCar("c1");

        assertFalse(parkingLot.isFull());
    }

}