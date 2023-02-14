package labo.tftic.projetcuisine.services.aliment;


import labo.tftic.projetcuisine.models.entities.Aliment;
import labo.tftic.projetcuisine.repositories.AlimentRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier(value = "aliment")
public class AlimentServiceImpl implements AlimentService {
    private final AlimentRepositorie alimentRepositorie;

    @Autowired
    public AlimentServiceImpl(AlimentRepositorie alimentRepositorie) {

        this.alimentRepositorie = alimentRepositorie;
    }

    @Override
    public List<Aliment> readAll() {
        return this.alimentRepositorie.findAllByActive(true);
    }

    @Override
    public Aliment create(Aliment obj) {
        return this.alimentRepositorie.save(obj);
    }
}
