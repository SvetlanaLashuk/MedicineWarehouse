package warehouse.service;

import warehouse.entity.License;

import java.util.Date;
import java.util.List;

/**
 *  License service
 */

public interface LicenseService {
    List<License> findAll();
    List<License> findByLicenseDateAfter(Date date);
}
