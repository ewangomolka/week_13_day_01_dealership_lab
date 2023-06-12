package org.example;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> car;
    private double till;

    public Dealership(double till) {
        this.car = new ArrayList<Car>();
        this.till = till;
    }

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addCar(Car car) {
        this.car.add(car);
    }
    public int getCarsInStock(){
        return this.car.size();
    }
}
