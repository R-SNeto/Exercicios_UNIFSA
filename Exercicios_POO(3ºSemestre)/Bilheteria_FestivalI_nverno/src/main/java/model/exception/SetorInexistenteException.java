package model.exception;

public class SetorInexistenteException extends BilheteriaException {
    public SetorInexistenteException(String message) {
        super(message);
    }

    public SetorInexistenteException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
