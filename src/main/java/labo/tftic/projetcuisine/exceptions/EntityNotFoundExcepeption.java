package labo.tftic.projetcuisine.exceptions;

public class EntityNotFoundExcepeption extends RuntimeException{

private ErrorCodes errorCodes;

public EntityNotFoundExcepeption(String message) {
    super(message);

}
public EntityNotFoundExcepeption(String message, Throwable cause){
    super(message, cause);

}
public EntityNotFoundExcepeption(String message, Throwable cause, ErrorCodes errorCodes){
    super(message, cause);
    this.errorCodes = errorCodes;
    }


}
