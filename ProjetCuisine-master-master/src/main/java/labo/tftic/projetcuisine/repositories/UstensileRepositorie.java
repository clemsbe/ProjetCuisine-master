package labo.tftic.projetcuisine.repositories;

import labo.tftic.projetcuisine.models.entities.Ustensile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UstensileRepositorie extends JpaRepository<Ustensile, Integer>, JpaSpecificationExecutor<Ustensile> {
}
