package org.example;

public class Manufacturer {

    private String brand;
    private String model;
    CarType carType;

    public Manufacturer(String brand, String model, CarType carType) {
        this.brand = brand;
        this.model = model;
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
