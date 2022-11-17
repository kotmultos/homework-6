package org.example;

import junit.framework.TestCase;

import java.time.LocalDate;

public class CarTest extends TestCase {
    public void testIsCarCheckoutValid_normal() {
        Car car = new Car(2, 6.7, LocalDate.of(2021, 11, 18));
        assertTrue(car.isCarAbleToMove());
    }

    public void testIsCarAbleToMove_noFuel() {
        Car car = new Car(0, 6.7, LocalDate.of(2021, 11, 18));
        assertFalse(car.isCarAbleToMove());
    }

    public void testIsCarCheckoutValid_valid() {
        Car car = new Car(0, 6.7, LocalDate.of(2021, 11, 18));
        assertTrue(car.isCarCheckoutValid());
    }

    public void testIsCarCheckoutValid_notValid() {
        Car car = new Car(0, 6.7, LocalDate.of(2015, 11, 18));
        assertFalse(car.isCarCheckoutValid());
    }

    public void testGetPowerReserve_normal() {
        Car car = new Car(25, 5, LocalDate.of(2021, 11, 18));
        assertEquals(500.0, car.getPowerReserve());
    }

    public void testGetPowerReserve_noFuel() {
        Car car = new Car(0, 6.7, LocalDate.of(2021, 11, 18));
        assertEquals(0.0, car.getPowerReserve());
    }
}