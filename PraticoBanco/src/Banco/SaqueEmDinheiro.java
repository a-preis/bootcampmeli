package Banco;

public class SaqueEmDinheiro implements Transacao {

    public void sacandoEmDinheiro() {
        if (transacaoOk()) {
            System.out.println("Fazendo um saldo em dinheiro");
        } else if (transacaoNaoOk()) {
            System.out.println("Saldo em dinheiro não realizado");
        }
    }

}
