package labo.tftic.projetcuisine.services.Recette;

import labo.tftic.projetcuisine.models.entities.Recette;
import labo.tftic.projetcuisine.repositories.RecetteRepository;
import labo.tftic.projetcuisine.services.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecetteSerciceImpl extends CrudServiceImpl<RecetteRepository, Recette, Integer> implements RecetteService {

    @Autowired
    public RecetteSerciceImpl(
            RecetteRepository recetteRepository
    ) {
        super (recetteRepository);
    }
}