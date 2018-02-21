package warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.entity.Pharmacy;
import warehouse.entity.Producer;
import warehouse.repository.PharmacyRepository;
import warehouse.service.PharmacyService;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService {
    @Autowired
    private PharmacyRepository pharmacyRepository;

    public List<Pharmacy> findAll() {
        return pharmacyRepository.findAll();
    }


}
