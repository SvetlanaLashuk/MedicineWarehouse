package warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import warehouse.entity.Producer;
import warehouse.service.ProducerService;

import java.util.List;

/**
 *  Producer service controller
 */

@RestController
@RequestMapping("/producers")
public class ProducerServiceController {
    @Autowired
    private ProducerService producerService;

    @RequestMapping(value="/prod/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Producer> findAll(){
        return producerService.findAll();
    }

    @RequestMapping(value="/prod/{country}", method = RequestMethod.GET)
    @ResponseBody
    public List<Producer> findByCountry(@PathVariable("country") String country){
        return producerService.findByCountry(country);
    }


}
