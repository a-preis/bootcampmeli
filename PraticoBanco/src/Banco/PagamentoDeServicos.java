package Banco;

public class PagamentoDeServicos implements Transacao {

    public void pagandoServico() {
        if (transacaoOk()) {
            System.out.println("Fazendo um pagamento de servico");
        } else if (transacaoNaoOk()) {
            System.out.println("Pagamento não realizado");
        }
    }
}
