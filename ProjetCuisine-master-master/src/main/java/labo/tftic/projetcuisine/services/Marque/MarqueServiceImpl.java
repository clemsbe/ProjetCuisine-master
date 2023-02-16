package labo.tftic.projetcuisine.services.Marque;

import labo.tftic.projetcuisine.models.entities.Marque;
import labo.tftic.projetcuisine.repositories.MarqueRepository;
import labo.tftic.projetcuisine.services.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarqueServiceImpl extends CrudServiceImpl<MarqueRepository, Marque, Integer> implements MarqueService {

    @Autowired
    public MarqueServiceImpl(
            MarqueRepository marqueRepository
    ) {
        super (marqueRepository);
    }
}