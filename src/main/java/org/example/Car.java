package org.example;

public class Car {

    private Engine engine;
    private Tyres tyres;
    private Manufacturer manufacturer;

    private double price;
    private String color;

    public Car(Engine engine, Tyres tyres, Manufacturer manufacturer, double price, String color) {
        this.engine = engine;
        this.tyres = tyres;
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
