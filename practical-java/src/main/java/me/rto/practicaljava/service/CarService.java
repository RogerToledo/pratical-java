package me.rto.practicaljava.service;

import me.rto.practicaljava.entity.Car;

import java.util.List;

public interface CarService {

    List<String> BRANDS = List.of("Toyota", "Honda", "Ford", "BMW", "Mitsubishi");
    List<String> COLORS = List.of("Red", "Black", "White", "Blue", "Silver");
    List<String> TYPES = List.of("Sedan", "SUV", "MPV", "Hatchback", "Convertible");
    List<String> ADDITIONAL_FEATURES = List.of("GPS", "Alarm", "Sunroof", "Media player", "Leather seats");
    List<String> FUELS = List.of("Petrol", "Eletric", "Hybrid");
    List<String> TIRE_MANUFACTURERS = List.of("Goodyear", "Bridgestone", "Toyo");
    Car generateCar();
}
