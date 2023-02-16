package labo.tftic.projetcuisine.models.viewmodels.Aliment;

import labo.tftic.projetcuisine.models.entities.Aliment;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class AlimentListVM {

    private List<Aliment> values = new ArrayList<>();

    public int getSize() { return values.size(); }

    public String getFullname(int index) {

        Aliment aliment = this.values.get(index);

        return aliment.getNom()+ " " + aliment.getQuantite();

    }
}
