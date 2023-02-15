package labo.tftic.projetcuisine.models.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UstensilesDTO {

    private String nom;

    private String taille;

    private String materiaux;


}
