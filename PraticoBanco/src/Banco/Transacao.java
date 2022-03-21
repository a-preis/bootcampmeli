package Banco;

public interface Transacao {
    default boolean transacaoOk() {
        return true;
    }

    ;

    default boolean transacaoNaoOk() {
        return false;
    }
}
