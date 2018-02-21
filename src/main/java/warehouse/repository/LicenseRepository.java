package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import warehouse.entity.License;

import java.util.Date;
import java.util.List;

/**
 *  Spring Data JPA repository for the License entity
 */

public interface LicenseRepository  extends JpaRepository<License, Integer> {
    List<License> findByLicenseDateAfter(Date date);
}
