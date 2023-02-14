package labo.tftic.projetcuisine.services.aliment;


import labo.tftic.projetcuisine.models.entities.Aliment;
import labo.tftic.projetcuisine.repositories.AlimentRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier(value = "Aliment")
public class AlimentServiceImpl implements AlimentService {
    private final AlimentRepositorie alimentRepositorie;

    @Autowired
    public AlimentServiceImpl(AlimentRepositorie alimentRepositorie) {
        this.alimentRepositorie = alimentRepositorie;
    }
@Override

public List<Aliment> readAll() { return this.alimentRepositorie.findAllById(); }
    @Override
    public Aliment create(Aliment obj) { return this.alimentRepositorie.save(obj); }

//    protected AlimentServiceImpl(AlimentRepositorie alimentRepositorie) {
//        super(alimentRepositorie);
//        this.alimentRepositorie = alimentRepositorie;
//    }
}

