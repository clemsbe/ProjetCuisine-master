package labo.tftic.projetcuisine.controllers;


import jakarta.validation.Valid;
import labo.tftic.projetcuisine.models.entities.Aliment;
import labo.tftic.projetcuisine.models.forms.aliment.AlimentCreateForm;
import labo.tftic.projetcuisine.models.viewmodels.Aliment.AlimentListVM;
import labo.tftic.projetcuisine.services.aliment.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = {"/aliment"})
public class AlimentController extends BaseController {

    private final AlimentService alimentService;
@Autowired
    public AlimentController(AlimentService alimentService) {
        this.alimentService = alimentService;
    }

    @GetMapping
    public String listFruits(Model model) {
        List<Aliment> alimentList = this.alimentService.readAll();

        AlimentListVM vm = new AlimentListVM();
        vm.equals(alimentList);

        model.addAttribute("model", vm);
        return "aliment/list";
    }

    @PostMapping(path = {"/add", "/create"})
    public String createAction(
            Model model,
            @Valid AlimentCreateForm form,
            BindingResult result
    ) {

        if (result.hasErrors()) {
            model.addAttribute("errors", this.getErrors(result));
            return "aliment/create";
        }
        this.alimentService.create(form.toBll());

        return "redirect:/aliment";
    }

}



