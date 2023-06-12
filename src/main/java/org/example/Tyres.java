package org.example;

public class Tyres {

    private String brand;
    private int miles;

    public Tyres(String brand, int miles) {
        this.brand = brand;
        this.miles = miles;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
