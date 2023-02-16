package labo.tftic.projetcuisine.models.forms;

import labo.tftic.projetcuisine.models.entities.Aliment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import jakarta.validation.constraints.NotBlank;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlimentCreateForm {
//    @NotBlank(message = "errors.notBlank")
    private String nom;
//    @NotBlank(message = "errors.notBlank")
    private Integer quantite;

    public Aliment toBll() {

        return Aliment.builder()
                .nom(nom)
                .quantite(quantite)
                .active(true)
                .build();
    }

    public Aliment fromBll() {
        return Aliment.builder()
                .nom(nom)
                .quantite(quantite)
                .build();
    }
}