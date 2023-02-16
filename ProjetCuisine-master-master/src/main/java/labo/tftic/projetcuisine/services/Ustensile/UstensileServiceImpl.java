package labo.tftic.projetcuisine.services.Ustensile;

import labo.tftic.projetcuisine.models.entities.Ustensile;
import labo.tftic.projetcuisine.repositories.UstensileRepository;
import labo.tftic.projetcuisine.services.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UstensileServiceImpl extends CrudServiceImpl<UstensileRepository, Ustensile, Integer> implements UstensileService {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Autowired
    public UstensileServiceImpl(
        UstensileRepository ustensileRepository
    ){
    super(ustensileRepository);
    }
}
