package model.exception;

public class BilheteriaException extends Exception {
    public BilheteriaException(String message) {
        super(message);
    }

    public BilheteriaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

}
