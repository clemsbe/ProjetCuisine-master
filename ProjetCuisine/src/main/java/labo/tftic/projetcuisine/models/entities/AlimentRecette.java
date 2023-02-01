package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import labo.tftic.projetcuisine.models.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AlimentRecette extends AbstractEntity {

    private int quantite;
    @ManyToOne
    private Aliment aliment;
    @ManyToOne
    private Recette recette;


}
