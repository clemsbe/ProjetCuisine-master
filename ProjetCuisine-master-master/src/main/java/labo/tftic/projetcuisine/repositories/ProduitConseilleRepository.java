package labo.tftic.projetcuisine.repositories;

import labo.tftic.projetcuisine.models.entities.ProduitConseille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitConseilleRepository extends JpaRepository<ProduitConseille, Integer>, JpaSpecificationExecutor<ProduitConseille> {
}