package labo.tftic.projetcuisine.models.forms;

import labo.tftic.projetcuisine.models.entities.Recette;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import jakarta.validation.constraints.NotBlank;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RecetteCreateForm {
    //    @NotBlank(message = "errors.notBlank")
    private String nom;
    //    @NotBlank(message = "errors.notBlank")
    private String auteur;

    private String source;


    public Recette toBll() {
        return Recette.builder()
                .nom(nom)
                .auteur(auteur)
                .source(source)
                .build();
    }

    public static RecetteCreateForm fromBll(Recette recette) {
        return RecetteCreateForm.builder()
                .nom(recette.getNom())
                .auteur(recette.getAuteur())
                .source(recette.getSource())
                .build();
    }
}