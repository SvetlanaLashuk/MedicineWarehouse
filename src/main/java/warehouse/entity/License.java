package warehouse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

/**
 * Licence entity
 */
@Entity
@Table(name = "license")
public class License implements java.io.Serializable {
    private Integer idPharmacy;
    private Date licenseDate;
    private Pharmacy pharmacy;
    private Integer number;

    public License(){}

    public License(Integer number, Date licenseDate, Pharmacy pharmacy){
        this.number = number;
        this.licenseDate = licenseDate;
        this.pharmacy = pharmacy;
    }

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "pharmacy"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id_pharmacy", nullable = false)
    public Integer getIdPharmacy() {
        return idPharmacy;
    }

    public void setIdPharmacy(Integer idPharmacy) {
        this.idPharmacy = idPharmacy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "license_date", nullable = false)
    public Date getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(Date licenseDate) {
        this.licenseDate = licenseDate;
    }

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Column(name = "number", nullable = false)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


}
