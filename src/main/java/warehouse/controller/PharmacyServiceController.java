package warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import warehouse.entity.Pharmacy;
import warehouse.repository.PharmacyRepository;

import java.util.List;

/**
 *  Pharmacy service controller
 */

@RestController
@RequestMapping("/pharmacies")
public class PharmacyServiceController {
    @Autowired
    private PharmacyRepository pharmacyRepository;

    @RequestMapping(value="/pharm/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Pharmacy> findAll(){
        return pharmacyRepository.findAll();
    }
}
