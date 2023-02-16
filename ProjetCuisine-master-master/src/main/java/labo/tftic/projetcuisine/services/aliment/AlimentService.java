package labo.tftic.projetcuisine.services.aliment;

import labo.tftic.projetcuisine.models.dtos.AlimentDTO;
import labo.tftic.projetcuisine.models.entities.Aliment;
import labo.tftic.projetcuisine.models.entities.Recette;
import labo.tftic.projetcuisine.services.CrudService;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;

public interface AlimentService extends CrudService<Aliment, Integer> {

//    Map<Aliment, Integer> readAlimentDispo(Pageable pageable);

    Map<Aliment, Integer> readAlimentNeedRecette(Pageable pageable);

}

