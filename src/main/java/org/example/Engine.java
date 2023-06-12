package org.example;

public class Engine{

    private double volume;
    private int bhp;
    private int torque;

    public Engine(double volume, int bhp, int torque) {
        this.volume = volume;
        this.bhp = bhp;
        this.torque = torque;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getBhp() {
        return bhp;
    }

    public void setBhp(int bhp) {
        this.bhp = bhp;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }
}
