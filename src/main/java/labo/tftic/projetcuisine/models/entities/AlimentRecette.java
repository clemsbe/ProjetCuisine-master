package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AlimentRecette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int quantite;
    @ManyToOne
    private Aliment aliment;
    @ManyToOne
    private Recette recette;


}
