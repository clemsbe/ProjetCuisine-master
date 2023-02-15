package labo.tftic.projetcuisine.services.Marque;

import labo.tftic.projetcuisine.models.entities.Marque;
import labo.tftic.projetcuisine.repositories.MarqueRepositorie;
import labo.tftic.projetcuisine.services.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarqueServiceImpl extends CrudServiceImpl<MarqueRepositorie, Marque, Integer> implements MarqueService {

    @Autowired
    public MarqueServiceImpl(
            MarqueRepositorie marqueRepositorie
    ) {
        super (marqueRepositorie);
    }
}