package model.exception;

public class CarteirinhaInvalidaException extends BilheteriaException {
    public CarteirinhaInvalidaException(String message) {
        super(message);
    }

    public CarteirinhaInvalidaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
