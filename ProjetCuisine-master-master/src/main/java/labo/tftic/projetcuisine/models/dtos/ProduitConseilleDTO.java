package labo.tftic.projetcuisine.models.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProduitConseilleDTO {

    private String nom;

    private String rayon;

    private String contenant;

}
