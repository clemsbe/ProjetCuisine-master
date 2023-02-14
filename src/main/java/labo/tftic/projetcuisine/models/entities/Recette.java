package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Recette")
public class Recette{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    @Getter

    @Column
    private String nom;
    @Setter
    @Getter
    @Column
    private String auteur;
    @Setter
    @Getter
    @Column
    private String source;
    @Setter
    @Getter
    @Column
    private boolean recetteOld;

    @OneToMany(mappedBy = "recette")
    private List<Aliment> alimentList;

@OneToOne
    private User users;

@ManyToOne
    private ProduitConseille produitconseille;

@OneToMany(mappedBy = "recette")
    private List<Ustensile> ustensileList;

}
