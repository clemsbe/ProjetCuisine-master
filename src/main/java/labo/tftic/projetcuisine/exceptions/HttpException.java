package labo.tftic.projetcuisine.exceptions;

import labo.tftic.projetcuisine.models.exceptions.HttpExceptionDTO;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class HttpException extends RuntimeException {
    private final HttpExceptionDTO exception;

    public HttpException(HttpStatus status, String message) {
        super(message);
        exception = HttpExceptionDTO.builder()
                .status(status.value())
                .message(message)
                .build();
    }
}
