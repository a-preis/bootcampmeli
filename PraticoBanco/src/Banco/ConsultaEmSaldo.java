package Banco;

public class ConsultaEmSaldo implements Transacao {

    public void consultandoEmSaldo() {
        if (transacaoOk()) {
            System.out.println("Fazendo uma consulta em saldo");
        } else if (transacaoNaoOk()) {
            System.out.println("Consulta em saldo não realizada");
        }
    }

}
