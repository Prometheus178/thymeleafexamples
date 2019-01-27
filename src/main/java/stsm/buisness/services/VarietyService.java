package stsm.buisness.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stsm.buisness.entitys.Variety;
import stsm.buisness.entitys.repositories.VarietyRepository;

import java.util.List;
@Service
public class VarietyService {
    @Autowired
    VarietyRepository varietyRepository;

    public List<Variety> findAll(){
        return varietyRepository.findAll();
    }

    public Variety findById(final Integer id) {
        return this.varietyRepository.findById(id);
    }
}
