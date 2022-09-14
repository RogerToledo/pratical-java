package me.rto.practicaljava.api.server;

import me.rto.practicaljava.entity.Car;
import me.rto.practicaljava.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RequestMapping(value = "/api/car/v1")
@RestController
public class CarApi {

    private static final Logger logger = LoggerFactory.getLogger(CarApi.class);

    @Autowired
    private CarService carService;

    @GetMapping(value = "/random", produces = MediaType.APPLICATION_JSON_VALUE)
    public Car random() {
        return carService.generateCar();
    }

    @PostMapping(value = "/echo", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String echo(@RequestBody Car car){
        logger.info("Car is {}", car);

        return car.toString();
    }
}
