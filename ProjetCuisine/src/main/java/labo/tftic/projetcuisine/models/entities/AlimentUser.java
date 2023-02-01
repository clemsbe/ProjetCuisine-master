package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import labo.tftic.projetcuisine.models.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class AlimentUser extends AbstractEntity {
    private int quantite;

    @ManyToOne
    private User user;

    @ManyToOne
    private Aliment aliment;
}
