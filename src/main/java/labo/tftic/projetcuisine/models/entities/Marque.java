package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Marque{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    private String magasin;

    @OneToMany(mappedBy = "marque")
    private List<ProduitConseille> produitConseilleList;


}
