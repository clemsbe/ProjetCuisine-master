package labo.tftic.projetcuisine.models.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecettedDTO {

    private String nom;

    private String auteur;

    private String source;

    private boolean recetteOld;

    public String getCode() {
        return null;
    }
}
