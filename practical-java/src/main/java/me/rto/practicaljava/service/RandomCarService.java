package me.rto.practicaljava.service;

import me.rto.practicaljava.entity.Car;
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

        Car car = new Car(brand, color, type);
        car.setPrice(price);
        car.setAvailable(available);
        car.setFirstReleaseDate(firstReleaseDate);
        car.setAddicionalFeatures(addicionalFeature);

        return car;
    }
}
