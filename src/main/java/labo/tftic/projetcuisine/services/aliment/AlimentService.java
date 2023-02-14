package labo.tftic.projetcuisine.services.aliment;

import labo.tftic.projetcuisine.models.entities.Aliment;

import java.util.List;

public interface AlimentService{

    List<Aliment> readAll();
    Aliment create(Aliment obj);
}

