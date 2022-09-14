package me.rto.practicaljava.service;

import me.rto.practicaljava.entity.Car;
import me.rto.practicaljava.util.RandomDateUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class RandomCarService implements CarService {

    @Override
    public Car generateCar() {
        String brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
        String color = COLORS.get(ThreadLocalRandom.current().nextInt(0, COLORS.size()));
        String type = TYPES.get(ThreadLocalRandom.current().nextInt(0, TYPES.size()));

        int price = ThreadLocalRandom.current().nextInt(5000, 12001);
        boolean available = ThreadLocalRandom.current().nextBoolean();
        LocalDate firstReleaseDate = RandomDateUtil.generateRandomLocalDate();

        Car car = new Car(brand, color, type);
        car.setPrice(price);
        car.setAvailable(available);
        car.setFirstReleaseDate(firstReleaseDate);

        return car;
    }
}
