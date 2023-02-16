package labo.tftic.projetcuisine.repositories;

import labo.tftic.projetcuisine.models.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Integer>, JpaSpecificationExecutor<Marque> {
}
