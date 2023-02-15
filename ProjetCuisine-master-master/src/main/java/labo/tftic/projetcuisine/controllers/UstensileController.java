package labo.tftic.projetcuisine.controllers;

import labo.tftic.projetcuisine.exceptions.HttpNotFoundException;
import labo.tftic.projetcuisine.models.entities.Ustensile;
import labo.tftic.projetcuisine.services.Ustensile.UstensileService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@RestController
@RequestMapping(path = {"/ustensile"})
public class UstensileController implements BaseRestController<Ustensile, Integer> {
    private final UstensileService ustensileService;

    public UstensileController(UstensileService ustensileService) {
        this.ustensileService = ustensileService;
    }

    @Override
    public ResponseEntity<Ustensile> ReadAll(Integer id) {
        return null;
    }

    //    @Secured(value = {"ROLE_ADMIN"})
    @GetMapping
    public ResponseEntity<Collection<Ustensile>>readAll(
            @RequestParam(name = "_page", defaultValue = "1") int page,
            @RequestParam(name = "_size", defaultValue = "5") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(this.ustensileService.readAll().toList());
    }

    @GetMapping(path = {"/{id:[0-9]+}"})
    public ResponseEntity<Ustensile> readOne(
            @PathVariable Integer id
    ) {
        Ustensile aliment = this.ustensileService.readOneByKey(id).orElseThrow(() -> new HttpNotFoundException("Aliment with id(" + id + ") is not found"));

        return ResponseEntity.ok(aliment);
    }
}