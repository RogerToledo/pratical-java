package me.rto.practicaljava.repository;

import me.rto.practicaljava.entity.Car;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarElasticRepository extends ElasticsearchRepository<Car, String> {

}
