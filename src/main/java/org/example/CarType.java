package org.example;

public enum CarType {

    ELECTRIC("Electric"),
    DIESEL("Diesel"),
    PETROL("Petrol"),
    HYBRID("Hybrid");

    private final String carType;

    CarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return this.carType;
    }
}
