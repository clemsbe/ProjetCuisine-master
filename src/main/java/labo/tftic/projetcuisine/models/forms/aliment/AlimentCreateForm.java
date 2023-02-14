package labo.tftic.projetcuisine.models.forms.aliment;

import labo.tftic.projetcuisine.models.entities.Aliment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlimentCreateForm {
    @NotBlank(message = "errors.notBlank")
    private String nom;
    @NotBlank(message = "errors.notBlank")
    private String unite;

    public Aliment toBll() {
        return Aliment.builder()
                .nom(nom)
                .unite(unite)
                .active(true)
                .build();
    }

    public static AlimentCreateForm fromBll(Aliment employe) {
        return AlimentCreateForm.builder()
                .nom(employe.getNom())
                .unite(employe.getUnite())
                .build();
    }
}