package me.rto.practicaljava.entity;

public class Engine {

    private String fuelType;
    private int powerHorse;
    private String color;
    private String serialNumber;

    public Engine() {
    }

    public Engine(String fuelType, int powerHorse) {
        this.fuelType = fuelType;
        this.powerHorse = powerHorse;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", powerHorse=" + powerHorse +
                '}';
    }
}
