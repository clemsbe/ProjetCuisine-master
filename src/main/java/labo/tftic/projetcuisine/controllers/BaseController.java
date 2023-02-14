package labo.tftic.projetcuisine.controllers;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class BaseController {

    public Map<String, List<FieldError>> getErrors(BindingResult bindingResult) {
        return bindingResult.getFieldErrors().stream()
                .collect(Collectors.groupingBy(FieldError::getField));
    }
}
