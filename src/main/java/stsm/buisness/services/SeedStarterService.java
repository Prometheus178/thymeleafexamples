package stsm.buisness.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stsm.buisness.entitys.SeedStarter;
import stsm.buisness.entitys.repositories.SeedStarterRepository;
import java.util.List;
@Service
public class SeedStarterService {

    @Autowired
    private SeedStarterRepository seedstarterRepository;
    public SeedStarterService() {
        super();
    }
    public List<SeedStarter> findAll() {
        return this.seedstarterRepository.findAll();
    }

    public void add(final SeedStarter seedStarter) {
        this.seedstarterRepository.add(seedStarter);
    }
}
