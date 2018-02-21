package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import warehouse.entity.Pharmacy;

import java.util.List;

/**
 *  Spring Data JPA repository for the Pharmacy entity
 */

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
}
