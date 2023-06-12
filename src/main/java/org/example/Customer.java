package org.example;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double cash;

    private ArrayList<Car> car;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.car = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
