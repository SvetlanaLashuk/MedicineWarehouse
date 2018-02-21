package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import warehouse.entity.Medicine;

import java.util.List;

/**
 *  Spring Data JPA repository for the Medicine entity
 */

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
    List<Medicine> findByRecipeTrue();

    @Query(value = "SELECT * FROM Medicine WHERE price > ?1", nativeQuery = true)
    List<Medicine> findByPriceGreaterThan(Float price);

    @Query(value = "SELECT * FROM medicine m, producer p WHERE m.id_producer = p.id_producer", nativeQuery = true)
    List<Medicine> findMedicine();

    @Query(value = "SELECT *, producer_name, medicine_name FROM producer LEFT JOIN medicine " +
            "ON producer.id_producer = medicine.id_producer ORDER BY producer_name, medicine_name", nativeQuery = true)
    List<Medicine> findProducersAndMedicines();


}
