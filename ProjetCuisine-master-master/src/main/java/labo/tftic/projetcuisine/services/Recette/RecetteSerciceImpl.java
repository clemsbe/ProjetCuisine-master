package labo.tftic.projetcuisine.services.Recette;

import labo.tftic.projetcuisine.models.entities.Recette;
import labo.tftic.projetcuisine.repositories.RecetteRepositorie;
import labo.tftic.projetcuisine.services.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecetteSerciceImpl extends CrudServiceImpl<RecetteRepositorie, Recette, Integer> implements RecetteService {

    @Autowired
    public RecetteSerciceImpl(
            RecetteRepositorie recetteRepositorie
    ) {
        super (recetteRepositorie);
    }
}