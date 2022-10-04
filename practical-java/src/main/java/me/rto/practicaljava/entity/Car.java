package me.rto.practicaljava.entity;

import java.time.LocalDate;
import java.util.List;

public class Car {

    private String brand;
    private String color;
    private String type;
    private int price;
    private boolean available;
    private LocalDate firstReleaseDate;
    private List<String> addicionalFeatures;
    private Engine engine;
    private Tire tire;

    public Car() {
    }

    public Car(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(LocalDate firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public List<String> getAddicionalFeatures() {
        return addicionalFeatures;
    }

    public void setAddicionalFeatures(List<String> addicionalFeatures) {
        this.addicionalFeatures = addicionalFeatures;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return String.format("Car[brand=%s, color=%s, type=%s]", brand, color, type);
    }
}
