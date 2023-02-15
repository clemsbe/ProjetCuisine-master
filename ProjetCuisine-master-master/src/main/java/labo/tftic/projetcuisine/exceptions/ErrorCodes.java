package labo.tftic.projetcuisine.exceptions;

public enum ErrorCodes {

    ALIMENT_NOT_FOUND(1000),
    ALIMENT_NOT_VALID(1001),
    RECETTE_NOT_FOUND(2000),
    USTENSIlE_NOT_FOUND(3000),
    MARQUE_NOT_FOUND(4000)
    ;

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
