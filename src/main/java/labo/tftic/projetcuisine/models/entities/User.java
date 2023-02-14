package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    @Getter
    @Column (nullable = false)
    private String pseudo;
    @Setter
    @Getter
    @Column
    private String favoris;

    @Getter
    @Setter
    @Column(nullable = false)
    private String email;

    @OneToOne(mappedBy = "users")
    private Recette recette;


}
