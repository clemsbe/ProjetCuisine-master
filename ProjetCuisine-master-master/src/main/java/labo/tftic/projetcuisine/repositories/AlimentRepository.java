package labo.tftic.projetcuisine.repositories;

import labo.tftic.projetcuisine.models.entities.Aliment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;

import static org.hibernate.sql.ast.Clause.FROM;

@Repository
public interface AlimentRepository extends JpaRepository<Aliment, Integer>, JpaSpecificationExecutor {

    //query comparant les aliments disponibles et les aliments necessaires dans une recette

    //creé par chtgpt

    //Dans cette requête, on récupère les entités Recette, Aliment et RecetteAliment (qui est une entité qui permet de représenter la relation entre une recette et un aliment, en stockant notamment la quantité d'aliment nécessaire pour la recette).
    //La condition WHERE r.id = :idRecette permet de filtrer les résultats pour ne récupérer que les entités associées à la recette avec l'ID spécifié en paramètre.
    //La partie (ra.quantite - a.quantite) as difference permet de calculer la différence entre la quantité d'aliment nécessaire pour la recette (ra.quantite) et la quantité d'aliment disponible (a.quantite). Cette différence est renvoyée sous forme d'une colonne appelée difference.
    //Enfin, la condition (ra.quantite - a.quantite) > 0 permet de ne récupérer que les entités où la quantité d'aliment nécessaire est supérieure à la quantité d'aliment disponible, ce qui correspond aux aliments manquants pour la recette.
    //La requête renvoie une liste d'objets Object[], chaque objet étant un tableau contenant la recette, l'aliment manquant et la différence entre la quantité nécessaire et la quantité disponible. Notez que la classe Recette et la classe Aliment doivent avoir une relation ManyToMany pour que cette requête fonctionne.


    @Query("SELECT r, a, (ra.quantite - a.quantite) as difference FROM AlimentRecette ra JOIN ra.recette r JOIN ra.aliment a WHERE r.id = :idRecette AND (ra.quantite - a.quantite) > 0")
    Map<Aliment, Integer> readAlimentNeedRecette();



//    Map<Aliment, Integer> readAlimentDispo(Pageable pageable);
//
}
