package labo.tftic.projetcuisine.controllers;

import labo.tftic.projetcuisine.exceptions.HttpNotFoundException;
import labo.tftic.projetcuisine.models.entities.Marque;
import labo.tftic.projetcuisine.services.Marque.MarqueService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/marque")
public class MarqueController implements BaseRestController<Marque, Integer> {

    private final MarqueService marqueService;

    public MarqueController(MarqueService marqueService) {
        this.marqueService = marqueService;
    }

    @GetMapping(path = {"/{id:[0-9]+}"})
    public ResponseEntity<Marque> ReadAll(
            @PathVariable Integer id
    ) {
        Marque marque = this.marqueService.readOneByKey(id).orElseThrow(() -> new HttpNotFoundException("Marque with id(" + id + ") is not found"));

        return ResponseEntity.ok(marque);
    }

    @Override
    public ResponseEntity<Collection<Marque>> readAll(int page, int size) {
        return null;
    }
}

