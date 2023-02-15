package labo.tftic.projetcuisine.services.Ustensile;

import labo.tftic.projetcuisine.models.entities.Ustensile;
import labo.tftic.projetcuisine.repositories.UstensileRepositorie;
import labo.tftic.projetcuisine.services.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UstensileServiceImpl extends CrudServiceImpl<UstensileRepositorie, Ustensile, Integer> implements UstensileService {

    @Autowired
    public UstensileServiceImpl(
        UstensileRepositorie ustensileRepositorie
    ){
    super(ustensileRepositorie);
    }
}
