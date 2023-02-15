package labo.tftic.projetcuisine.config;


import labo.tftic.projetcuisine.exceptions.HttpException;
import labo.tftic.projetcuisine.models.exceptions.HttpExceptionDTO;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HttpControllerAdvice {

    @ExceptionHandler(value = {HttpException.class})
    public ResponseEntity<HttpExceptionDTO> httpExceptionHandler(HttpException exception) {
        return new ResponseEntity<>(exception.getException(), HttpStatusCode.valueOf(exception.getException().getStatus()));
    }

//    @ExceptionHandler(value = {HttpPreConditionFailedException.class})
//    public ResponseEntity<HttpPreConditionFailedException> httpPreConditionFailedExceptionHandle(HttpPreConditionFailedException exception) {
//        return new ResponseEntity<>(exception, HttpStatus.PRECONDITION_FAILED);
//    }
}
