package warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.entity.License;
import warehouse.service.LicenseService;

import java.util.Date;
import java.util.List;

/**
 *  License service controller
 */

@RestController
@RequestMapping("/licenses")
public class LicenseServiceController {

    @Autowired
    private LicenseService licenseService;

    @RequestMapping(value="/lic/all", method = RequestMethod.GET)
    @ResponseBody
    public List<License> findAll(){
        return licenseService.findAll();
    }

    @RequestMapping(value="/lic/{date}", method = RequestMethod.GET)
    @ResponseBody
    public List<License> findByLicenseDateAfter(@PathVariable("date") Date date){
        return licenseService.findByLicenseDateAfter(date);
    }

}
