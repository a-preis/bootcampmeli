package Banco;

public class Basico extends Cliente {

    ConsultaEmSaldo consultaEmSaldo = new ConsultaEmSaldo();
    PagamentoDeServicos pagamentoDeServicos = new PagamentoDeServicos();
    SaqueEmDinheiro saqueEmDinheiro = new SaqueEmDinheiro();

    public Basico(String nome, String cpf, int id) {
        super(nome, cpf, id);
    }

    public void consultaBasico() {
        consultaEmSaldo.consultandoEmSaldo();
    }

    public void pagamentoBasico() {
        pagamentoDeServicos.pagandoServico();
    }

    public void saqueBasico() {
        saqueEmDinheiro.sacandoEmDinheiro();
    }

}
