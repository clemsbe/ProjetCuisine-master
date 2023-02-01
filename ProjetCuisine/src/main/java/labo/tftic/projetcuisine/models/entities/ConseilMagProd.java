package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import labo.tftic.projetcuisine.models.AbstractEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Magasin conseillé")
public class ConseilMagProd extends AbstractEntity {

    private String nom;
    private String marque;
    private String rayon;
    private String contenant;

}
