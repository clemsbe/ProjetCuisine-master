package be.bstorm.tf.repositories;

import lombok.Getter;
import lombok.Setter;

public interface iCourant {
    public String numeroCourant = null;
    @Getter
    @Setter
            
    double solde = 0;

    public double ligneDeCredit = 0;
    
    
}
