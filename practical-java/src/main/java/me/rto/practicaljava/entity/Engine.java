package me.rto.practicaljava.entity;

public class Engine {
    private String fuelType;
    private int powerHorse;

    public Engine() {
    }

    public Engine(String fuelType, int horsePower) {
        this.fuelType = fuelType;
        this.powerHorse = horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPowerHorse() {
        return powerHorse;
    }

    public void setPowerHorse(int powerHorse) {
        this.powerHorse = powerHorse;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", horsePower=" + powerHorse +
                '}';
    }
}