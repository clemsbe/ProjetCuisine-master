package labo.tftic.projetcuisine.services.aliment;


import labo.tftic.projetcuisine.models.entities.Aliment;
import labo.tftic.projetcuisine.repositories.AlimentRepositorie;
import labo.tftic.projetcuisine.services.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentServiceImpl extends CrudServiceImpl <AlimentRepositorie, Aliment, Integer> implements AlimentService {

@Autowired
    public AlimentServiceImpl(
            AlimentRepositorie alimentRepositorie
) {
    super (alimentRepositorie);
}
}