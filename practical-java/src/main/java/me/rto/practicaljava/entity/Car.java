package me.rto.practicaljava.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDate;
import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Document(indexName = "practical-java")

public class Car {
    @Id
    private String id;
    private String brand;
    private String color;
    private String type;

    private int price;
    private boolean available;

    @Field(type= FieldType.Date, format= DateFormat.date)
    @JsonFormat(pattern="yyyy-MM-dd", timezone = "America/Sao_Paulo")
    private LocalDate firstRelease;
    @JsonInclude(value= JsonInclude.Include.NON_EMPTY)
    private String secretFeature;
    @JsonInclude(value= JsonInclude.Include.NON_EMPTY)
    private List<String> additionalFeatures;

    @JsonUnwrapped
    private Engine engine;
    private Tire tires;

    public Car() {
    }

    public Car(String brand, String color, String type, int price, boolean available, LocalDate firstRelease, String secretFeature, List<String> additionalFeatures, Engine engine, Tire tires) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.available = available;
        this.firstRelease = firstRelease;
        this.secretFeature = secretFeature;
        this.additionalFeatures = additionalFeatures;
        this.engine = engine;
        this.tires = tires;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDate getFirstRelease() {
        return firstRelease;
    }

    public void setFirstRelease(LocalDate firstRelease) {
        this.firstRelease = firstRelease;
    }

    public String getSecretFeature() {
        return secretFeature;
    }

    public void setSecretFeature(String secretFeature) {
        this.secretFeature = secretFeature;
    }

    public List<String> getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(List<String> additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTires() {
        return tires;
    }

    public void setTires(Tire tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", firstRelease=" + firstRelease +
                ", secretFeature='" + secretFeature + '\'' +
                ", additionalFeatures=" + additionalFeatures +
                ", engine=" + engine +
                ", tires=" + tires +
                '}';
    }
}
