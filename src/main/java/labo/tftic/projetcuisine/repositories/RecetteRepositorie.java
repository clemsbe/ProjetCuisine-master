package labo.tftic.projetcuisine.repositories;

import labo.tftic.projetcuisine.models.entities.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetteRepositorie extends JpaRepository<Recette, Integer>, JpaSpecificationExecutor<Recette> {
}
