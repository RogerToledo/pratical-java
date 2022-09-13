package me.rto.practicaljava.api.server;

import me.rto.practicaljava.entity.Car;
import me.rto.practicaljava.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RequestMapping(value = "/api/car/v1")
@RestController
public class CarApi {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/random", produces = MediaType.APPLICATION_JSON_VALUE)
    public Car random() {
        return carService.generateCar();
    }
}
