package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import labo.tftic.projetcuisine.models.AbstractEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Ustensile")
public class Ustensile extends AbstractEntity {
    @Setter
    @Getter
    @Column
    private String nom;
    @Setter
    @Getter
    @Column
    private String taille;
    @Setter
    @Getter
    @Column
    private String materiaux;


}
