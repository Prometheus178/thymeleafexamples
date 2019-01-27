package stsm.buisness.entitys.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import stsm.buisness.entitys.SeedStarter;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeedStarterRepository {

    private final List<SeedStarter> seedStarters = new ArrayList<SeedStarter>();

    public SeedStarterRepository() {
        super();
    }

    public List<SeedStarter> findAll(){
        return new ArrayList<SeedStarter>(this.seedStarters);
    }

    public void add(SeedStarter seedStarter) {
        this.seedStarters.add(seedStarter);
    }
}
