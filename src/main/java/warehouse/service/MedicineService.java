package warehouse.service;

import warehouse.entity.Medicine;

import java.util.List;

public interface MedicineService {
    List<Medicine> findAll();
    List<Medicine> findByRecipeTrue();
    List<Medicine> findByPriceGreaterThan(Float price);
    List<Medicine> findMedicine();
}
