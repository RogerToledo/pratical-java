package me.rto.practicaljava.entity;

public class Tire {
    private String manufacturer;
    private int size;
    private int price;

    public Tire() {};

    public Tire(String manufacturer, int size, int price) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}