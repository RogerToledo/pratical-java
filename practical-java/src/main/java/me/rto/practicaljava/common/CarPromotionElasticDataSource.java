package me.rto.practicaljava.common;

import me.rto.practicaljava.entity.CarPromotion;
import me.rto.practicaljava.repository.CarPromotionElasticRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CarPromotionElasticDataSource {

    private static final Logger LOG = LoggerFactory.getLogger(CarPromotionElasticDataSource.class);
    @Autowired
    private CarPromotionElasticRepository cArPromotionElasticRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void populateData() {
        cArPromotionElasticRepository.deleteAll();

        var carPromotions = new ArrayList<CarPromotion>();

        var carPromotion = new CarPromotion();
        carPromotion.setType("bonus");
        carPromotion.setDescription("Purchase in cash and get free luxury dinner");

        var carPromotion2 = new CarPromotion();
        carPromotion2.setType("bonus");
        carPromotion2.setDescription("Purchase luxury car and get free trip to Japan");

        var carPromotion3 = new CarPromotion();
        carPromotion3.setType("bonus");
        carPromotion3.setDescription("Purchase two cars and get 20 gram of gold");

        var carPromotion4 = new CarPromotion();
        carPromotion4.setType("discount");
        carPromotion4.setDescription("Purchase in cash and get 1% discount");

        var carPromotion5 = new CarPromotion();
        carPromotion5.setType("discount");
        carPromotion5.setDescription("Purchase before end of month to get 1.5% discount");

        var carPromotion6 = new CarPromotion();
        carPromotion6.setType("discount");
        carPromotion6.setDescription("Today only! We give 0.5% addicional discount");

        carPromotions.add(carPromotion);
        carPromotions.add(carPromotion2);
        carPromotions.add(carPromotion3);
        carPromotions.add(carPromotion4);
        carPromotions.add(carPromotion5);
        carPromotions.add(carPromotion6);

        cArPromotionElasticRepository.saveAll(carPromotions);

        LOG.info("Saved promotion data: {}", cArPromotionElasticRepository.count());
        System.out.println("Out - Saved promotion data: " + cArPromotionElasticRepository.count());
    }
}
