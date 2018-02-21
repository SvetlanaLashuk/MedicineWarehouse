package warehouse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Producer Entity
 */

@Entity
@Table(name = "producer")
public class Producer implements java.io.Serializable{
    private Integer idProducer;

    private String country;

    private String producerName;

    private Set<Medicine> medicineSet = new HashSet<Medicine>(0);

    public Producer(){}

    public Producer(String producerName, String country, Set<Medicine> medicineSet){
        this.producerName = producerName;
        this.country = country;
        this.medicineSet = medicineSet;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_producer", nullable = false)
    public Integer getIdProducer() {
        return idProducer;
    }

    public void setIdProducer(Integer idProducer) {
        this.idProducer = idProducer;
    }

    @Column(name = "country", nullable = false, length = 30)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "producer_name", nullable = false, length = 30)
    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }


    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producer")
    public Set<Medicine> getMedicineSet() {
        return medicineSet;
    }

    public void setMedicineSet(Set<Medicine> medicineSet) {
        this.medicineSet = medicineSet;
    }

    @Override
    public String toString() {
       return "Producer{" +
                "producer_name=" + producerName +
                 ", country=" + country +
                  ", id_producer=" + idProducer +
                '}';
    }
}

