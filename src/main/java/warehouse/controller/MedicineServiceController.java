package warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.entity.Medicine;
import warehouse.service.MedicineService;
import java.util.List;

/**
 *  Medicine service controller
 */

@RestController
@RequestMapping("/medicines")
public class MedicineServiceController {
    @Autowired
    private MedicineService medicineService;

    @RequestMapping(value="/medicine", method = RequestMethod.GET)
    @ResponseBody
    public List<Medicine> findMedicine(){
        return medicineService.findMedicine();

    }

    @RequestMapping(value="/med/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Medicine> findAll(){
        return medicineService.findAll();
    }

    @RequestMapping(value="/med/{price}", method = RequestMethod.GET)
    @ResponseBody
    public List<Medicine> findByPriceGreaterThan(@PathVariable("price") Float price){
        return medicineService.findByPriceGreaterThan(price);

    }



}
