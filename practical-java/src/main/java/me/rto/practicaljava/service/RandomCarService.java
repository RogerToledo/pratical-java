package me.rto.practicaljava.service;

import me.rto.practicaljava.entity.Car;
import me.rto.practicaljava.entity.Engine;
import me.rto.practicaljava.entity.Tire;
import me.rto.practicaljava.util.RandomDateUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class RandomCarService implements CarService {

    @Override
    public Car generateCar() {
        var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
        var color = COLORS.get(ThreadLocalRandom.current().nextInt(0, COLORS.size()));
        var type = TYPES.get(ThreadLocalRandom.current().nextInt(0, TYPES.size()));

        var price = ThreadLocalRandom.current().nextInt(5000, 12001);
        var available = ThreadLocalRandom.current().nextBoolean();
        var firstReleaseDate = RandomDateUtil.generateRandomLocalDate();

        int randomCount = ThreadLocalRandom.current().nextInt(ADDITIONAL_FEATURES.size());

        var addicionalFeature = new ArrayList<String>();
        for (int i = 0; i < randomCount; i++) {
            addicionalFeature.add(ADDITIONAL_FEATURES.get(i));
        }

        var fuel = FUELS.get(ThreadLocalRandom.current().nextInt(FUELS.size()));
        var powerHorse = ThreadLocalRandom.current().nextInt(100, 220);
        var engine = new Engine();
        engine.setFuelType(fuel);
        engine.setPowerHorse(powerHorse);

        var manufacturer = TIRE_MANUFACTURERS.get(ThreadLocalRandom.current().nextInt(TIRE_MANUFACTURERS.size()));
        var size = ThreadLocalRandom.current().nextInt(15, 18);
        var tirePrice = ThreadLocalRandom.current().nextInt(200, 400);

        var tire = new Tire();
        tire.setManufacturer(manufacturer);
        tire.setSize(size);
        tire.setPrice(tirePrice);

        var secretFeature = ThreadLocalRandom.current().nextBoolean() ? "Can fly" : null;

        Car car = new Car(brand, color, type);
        car.setPrice(price);
        car.setAvailable(available);
        car.setFirstReleaseDate(firstReleaseDate);
        car.setAddicionalFeatures(addicionalFeature);

        return car;
    }
}
