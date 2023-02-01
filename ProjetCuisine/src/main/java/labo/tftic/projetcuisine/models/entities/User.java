package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import labo.tftic.projetcuisine.models.AbstractEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class User extends AbstractEntity {
    @Setter
    @Getter
    @Column
    private String pseudo;
    @Setter
    @Getter
    @Column
    private String favoris;

    @Getter
    @Setter
    @Column
    private String email;



}
