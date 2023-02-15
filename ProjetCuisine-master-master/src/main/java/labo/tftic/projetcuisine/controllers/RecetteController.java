package labo.tftic.projetcuisine.controllers;

import labo.tftic.projetcuisine.exceptions.HttpNotFoundException;
import labo.tftic.projetcuisine.models.entities.Recette;
import labo.tftic.projetcuisine.services.Recette.RecetteService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/recettes")
public class RecetteController implements BaseRestController<Recette, Integer> {

    private final RecetteService recetteService;

    public RecetteController(RecetteService recetteService) {
        this.recetteService = recetteService;
    }

    @Override
    public ResponseEntity<Collection<Recette>> readAll(int page, int size) {
        return null;
    }

    @GetMapping(path = {"/{id:[0-9]+}"})
    public ResponseEntity<Recette> ReadAll(
            @PathVariable Integer id
    ) {
        Recette recette = this.recetteService.readOneByKey(id).orElseThrow(() -> new HttpNotFoundException("Recette with id(" + id + ") is not found"));

        return ResponseEntity.ok(recette);
    }
}

