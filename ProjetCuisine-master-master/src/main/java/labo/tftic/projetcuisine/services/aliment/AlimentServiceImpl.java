package labo.tftic.projetcuisine.services.aliment;


import labo.tftic.projetcuisine.models.entities.Aliment;
import labo.tftic.projetcuisine.models.entities.Recette;
import labo.tftic.projetcuisine.repositories.AlimentRepository;
import labo.tftic.projetcuisine.services.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Map;

@Service
public class AlimentServiceImpl extends CrudServiceImpl <AlimentRepository, Aliment, Integer> implements AlimentService {

@Autowired
    public AlimentServiceImpl(
            AlimentRepository alimentRepository
) {
    super (alimentRepository);
}

//@Override
//    public Map<Aliment, Integer> readAlimentDispo(
//            Pageable pageable
//) {
//return this.repository.readAlimentDispo(pageable);
    @Override
    public Map<Aliment, Integer> readAlimentNeedRecette(Pageable pageable) {
        return this.repository.readAlimentNeedRecette();

    }


}
