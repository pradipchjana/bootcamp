package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {
    @Test
    void addParkingLot() {
        ParkingSystem parkingSystem1 = new ParkingSystem();
        parkingSystem1.addParkingLot("p1", 10);
        ParkingSystem parkingSystem2 = new ParkingSystem();

        parkingSystem2.addParkingLot("p1", 10);

        assertEquals(parkingSystem1,parkingSystem2);
    }

    @Test
    void shouldNotBeEqual() {
        ParkingSystem parkingSystem1 = new ParkingSystem();
        parkingSystem1.addParkingLot("p1", 10);
        ParkingSystem parkingSystem2 = new ParkingSystem();

        parkingSystem2.addParkingLot("p2", 10);

        assertNotEquals(parkingSystem1,parkingSystem2);
    }

    @Test
    void shouldParkCarOnGivenParkingLot() {
        ParkingSystem parkingSystem1 = new ParkingSystem();
        parkingSystem1.addParkingLot("p1", 10);
        assertTrue(parkingSystem1.park("p1","c1"));

    }
}