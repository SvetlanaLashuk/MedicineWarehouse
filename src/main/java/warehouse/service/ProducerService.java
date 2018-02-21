package warehouse.service;

import warehouse.entity.Producer;

import java.util.List;

public interface ProducerService {
    List<Producer> findAll();
    List<Producer> findByCountry(String country);
}
