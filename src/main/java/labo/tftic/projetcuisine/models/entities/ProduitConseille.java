package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table
public class ProduitConseille{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String rayon;
    private String contenant;

    @OneToMany(mappedBy = "produitconseille")
    private List<Recette> recette ;

@ManyToOne
    private Marque marque;
}
