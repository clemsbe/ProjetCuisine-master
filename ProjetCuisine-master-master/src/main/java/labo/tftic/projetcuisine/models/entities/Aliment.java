package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Aliment{

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
    private String unite;
    @ManyToOne
    private Recette recette;

    @Getter @Setter
    private boolean active = true;

}
