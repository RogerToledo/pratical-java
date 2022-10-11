package me.rto.practicaljava.service;

import java.util.List;

public interface CarPromotionService {

    List<String> PROMOTION_TYPES = List.of("bonus", "Discount");

    boolean isValidPromotionType(String promotionType);
}
