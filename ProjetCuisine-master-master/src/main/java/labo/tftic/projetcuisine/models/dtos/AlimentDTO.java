package labo.tftic.projetcuisine.models.dtos;

import labo.tftic.projetcuisine.models.entities.Aliment;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlimentDTO

{
private String nom;

private  String quantite;


public static AlimentDTO fromEntity(Aliment aliment){

    if (aliment == null) {
        return null;
    }

    return AlimentDTO.builder()
            .nom(aliment.getNom())
            .quantite(String.valueOf(aliment.getQuantite()))
            .build();
}


}

