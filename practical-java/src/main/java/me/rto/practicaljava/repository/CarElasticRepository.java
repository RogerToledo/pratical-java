package me.rto.practicaljava.repository;

import me.rto.practicaljava.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CarElasticRepository extends ElasticsearchRepository<Car, String> {
    public Page<Car> findByBrandAndColor(String brand, String color, Pageable pageable);

    public List<Car> findByFirstReleaseAfter(LocalDate date);

}
