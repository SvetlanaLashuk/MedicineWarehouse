package warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.entity.Medicine;
import warehouse.repository.MedicineRepository;
import warehouse.service.MedicineService;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService{
    @Autowired
    private MedicineRepository medicineRepository;

    public List<Medicine> findAll() {
        return medicineRepository.findAll();
    }

    public List<Medicine> findByRecipeTrue() {
        return medicineRepository.findByRecipeTrue();
    }

    public List<Medicine> findByPriceGreaterThan(Float price){
        return medicineRepository.findByPriceGreaterThan(price);
    }

    public List<Medicine> findMedicine(){
        return medicineRepository.findMedicine();
    }

}
