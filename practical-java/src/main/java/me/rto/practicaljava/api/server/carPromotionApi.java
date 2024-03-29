package me.rto.practicaljava.api.server;

import me.rto.practicaljava.Exception.IllegalApiParamException;
import me.rto.practicaljava.entity.CarPromotion;
import me.rto.practicaljava.repository.CarPromotionElasticRepository;
import me.rto.practicaljava.service.CarPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/car/v1")
public class carPromotionApi {
    @Autowired
    private CarPromotionService carPromotionService;
    @Autowired
    private CarPromotionElasticRepository carPromotionElasticRepository;

    @GetMapping(value = "/promotions")
    public List<CarPromotion> listAvailablePromotions(@RequestParam(name = "type") String promotionType,
                                                      @RequestParam(defaultValue = "0") int page,
                                                      @RequestParam(defaultValue = "10") int size) {
        if (!carPromotionService.isValidPromotionType(promotionType)) {
            throw new IllegalApiParamException("Invalid promotion type: " + promotionType);
        }

        var pageable = PageRequest.of(page, size);

        return carPromotionElasticRepository.findByType(promotionType, pageable).getContent();
    }

}
