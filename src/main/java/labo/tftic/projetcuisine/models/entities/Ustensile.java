package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.*;
import lombok.*;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Ustensile")
public class Ustensile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    @Getter
    @Column(nullable = false)
    private String nom;
    @Setter
    @Getter
    @Column
    private String taille;
    @Setter
    @Getter
    @Column
    private String materiaux;

    @ManyToOne
    private Recette recette;

}
