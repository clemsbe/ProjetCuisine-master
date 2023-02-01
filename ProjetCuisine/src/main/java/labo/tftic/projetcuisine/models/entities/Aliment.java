package labo.tftic.projetcuisine.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import labo.tftic.projetcuisine.models.AbstractEntity;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Aliment")
public class Aliment extends AbstractEntity {
    @Setter
    @Getter
    @Column
    private String nom;
    @Setter
    @Getter
    @Column
    private String unité;


}
