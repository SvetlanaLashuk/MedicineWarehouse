package warehouse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Medicine Entity
 */

@Entity
@Table(name = "medicine")
public class Medicine implements java.io.Serializable{

    private Integer idMedicine;

    private String medicineName;

    private Producer producer;

    private Boolean recipe;

    private Float price;

    private Set<Pharmacy> pharmacySet = new HashSet<Pharmacy>(0);

    public  Medicine(){}

    public Medicine(Producer producer, String medicineName, Float price, Boolean recipe, Set<Pharmacy> pharmacySet){
        this.producer = producer;
        this.medicineName = medicineName;
        this.price = price;
        this.recipe = recipe;
        this.pharmacySet = pharmacySet;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_medicine", nullable = false)
    public Integer getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(Integer idMedicine) {
        this.idMedicine = idMedicine;
    }

    @Column(name = "medicine_name", nullable = false, length = 30)
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producer", nullable = false)
    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Column(name = "recipe", nullable = false)
    public Boolean getRecipe() {
        return recipe;
    }

    public void setRecipe(Boolean recipe) {
        this.recipe = recipe;
    }

    @Column(name = "price", nullable = false)
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "medicineSet")
    public Set<Pharmacy> getPharmacySet() {
        return pharmacySet;
    }

    public void setPharmacySet(Set<Pharmacy> pharmacySet) {
        this.pharmacySet = pharmacySet;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "producer=" + producer+
               "medicine_name=" + medicineName +
                ", price=" + price +
                 ", recipe=" + recipe +
                 ", pharmacySet=" + pharmacySet +
                  ", id_medicine=" + idMedicine +
               '}';
    }
}
