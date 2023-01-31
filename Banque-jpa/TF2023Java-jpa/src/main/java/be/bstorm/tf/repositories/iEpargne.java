package be.bstorm.tf.repositories;

import be.bstorm.tf.models.entities.Personne;

import java.text.DateFormat;

public interface iEpargne {

    public String numeroEpa = null;

    public double soldeEpa = 0;

    public DateFormat dateDernierRetrait = null;
    public Personne titulaire = null;

}
