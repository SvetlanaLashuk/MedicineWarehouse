package warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.entity.Producer;
import warehouse.repository.ProducerRepository;
import warehouse.service.ProducerService;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    private ProducerRepository producerRepository;
    @Autowired
    private EntityManager em;

    public List<Producer> findAll() {
        return producerRepository.findAll();
    }

    public List<Producer> findByCountry(String country) {
           Query q = em.createNativeQuery("SELECT *, producer_name FROM producer  WHERE country = ?", Producer.class);
           q.setParameter(1, country);
         return q.getResultList();
    }

    public List<Producer> findProducersAndMedicines(){
        return  producerRepository.findProducersAndMedicines();
    }
}
