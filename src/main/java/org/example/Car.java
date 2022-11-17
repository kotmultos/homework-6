package org.example;

import java.time.LocalDate;

public class Car {
    private int currentFuel;
    private double fuelUsagePer100km;
    private LocalDate checkoutDate;

    public Car(int currentFuel, double fuelUsagePer100km, LocalDate checkoutDate) {
        this.currentFuel = currentFuel;
        this.fuelUsagePer100km = fuelUsagePer100km;
        this.checkoutDate = checkoutDate;
    }

    public boolean isCarAbleToMove() {
        return currentFuel != 0;
    }

    public boolean isCarCheckoutValid() {
        LocalDate today = LocalDate.now();
        LocalDate validTimeBoundary = LocalDate.of(today.getYear() - 2, today.getMonth(), today.getDayOfMonth());
        return this.checkoutDate.isAfter(validTimeBoundary);
    }

    public double getPowerReserve() {
        double result = 0;
        if (isCarAbleToMove()) {
            result = currentFuel / fuelUsagePer100km * 100;
        }
        return result;
    }
}