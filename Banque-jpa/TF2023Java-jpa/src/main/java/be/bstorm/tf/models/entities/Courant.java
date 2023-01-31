package be.bstorm.tf.models.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Courant extends Personne {

    public String numeroCourant;
    @Getter
    @Setter

    private double solde;

    public double ligneDeCredit;


    public static void Retrait() {

        double montant;
    }

    public static void Depot() {
        double montant;
        try {

        }

    }
}