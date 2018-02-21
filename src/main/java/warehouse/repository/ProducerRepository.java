package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import warehouse.entity.Producer;

import java.util.List;

/**
 * Spring Data JPA repository for the Producer entity
 */

public interface ProducerRepository extends JpaRepository<Producer, Integer> {
    List<Producer> findByCountry(String country);
}
