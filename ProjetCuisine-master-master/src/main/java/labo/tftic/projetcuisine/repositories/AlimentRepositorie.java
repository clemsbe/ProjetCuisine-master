package labo.tftic.projetcuisine.repositories;

import labo.tftic.projetcuisine.models.entities.Aliment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlimentRepositorie extends JpaRepository<Aliment, Integer> {
    List<Aliment> findAllByActive(boolean active);
}
