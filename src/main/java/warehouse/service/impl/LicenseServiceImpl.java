package warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.entity.License;
import warehouse.repository.LicenseRepository;
import warehouse.service.LicenseService;

import java.util.Date;
import java.util.List;

@Service
public class LicenseServiceImpl implements LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    public List<License> findAll(){return licenseRepository.findAll();}

    public List<License> findByLicenseDateAfter(Date date) {return licenseRepository.findByLicenseDateAfter(date);}
}

