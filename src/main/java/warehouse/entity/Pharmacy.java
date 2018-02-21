package warehouse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Pharmacy Entity
 */
@Entity
@Table(name = "pharmacy")
public class Pharmacy implements java.io.Serializable{
    private Integer idPharmacy;
    private License license;
    private String address;
    private String pharmacyName;
    private Integer phone;
    private Set<Medicine> medicineSet = new HashSet<Medicine>(0);


    public Pharmacy(){}

    public Pharmacy(String pharmacyName, String address, Integer phone, License license, Set<Medicine> medicineSet){
        this.pharmacyName = pharmacyName;
        this.address = address;
        this.phone = phone;
        this.license = license;
        this.medicineSet = medicineSet;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_pharmacy", nullable = false)
    public Integer getIdPharmacy() {
        return idPharmacy;
    }

    public void setIdPharmacy(Integer idPharmacy) {
        this.idPharmacy = idPharmacy;
    }

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pharmacy", cascade = CascadeType.ALL)
    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Column(name = "address", nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "pharmacy_name", nullable = false, length = 30)
    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    @Column(name = "phone", nullable = false)
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "pharmacy_medicine", joinColumns = {
            @JoinColumn(name = "id_pharmacy", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "id_medicine",
                    nullable = false, updatable = false) })
    public Set<Medicine> getMedicineSet() {
        return medicineSet;
    }

    public void setMedicineSet(Set<Medicine> medicineSet) {
        this.medicineSet = medicineSet;
    }
}
