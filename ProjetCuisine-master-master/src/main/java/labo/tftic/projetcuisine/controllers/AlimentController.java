package labo.tftic.projetcuisine.controllers;

import labo.tftic.projetcuisine.exceptions.HttpNotFoundException;
import labo.tftic.projetcuisine.models.entities.Aliment;
import labo.tftic.projetcuisine.services.aliment.AlimentService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@RestController
@RequestMapping(path = {"/aliments"})
public class AlimentController implements BaseRestController<Aliment, Integer> {
    private final AlimentService alimentService;

    public AlimentController(AlimentService alimentService) {
        this.alimentService = alimentService;
    }

    @Override
    public ResponseEntity<Aliment> ReadAll(Integer id) {
        return null;
    }

    //    @Secured(value = {"ROLE_ADMIN"})
    @GetMapping
    public ResponseEntity<Collection<Aliment>> readAll(
            @RequestParam(name = "_page", defaultValue = "1") int page,
            @RequestParam(name = "_size", defaultValue = "5") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(this.alimentService.readAll().toList());
    }

    @GetMapping(path = {"/{id:[0-9]+}"})
    public ResponseEntity<Aliment> readOne(
            @PathVariable Integer id
    ) {
        Aliment aliment = this.alimentService.readOneByKey(id)
                .orElseThrow(() -> new HttpNotFoundException("Aliment with id(" + id + ") is not found"));

        return ResponseEntity.ok(aliment);
    }
}
