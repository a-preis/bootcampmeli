package Banco;

public class Cobradores extends Cliente {

    SaqueEmDinheiro saqueEmDinheiro = new SaqueEmDinheiro();
    ConsultaEmSaldo consultaEmSaldo = new ConsultaEmSaldo();

    public Cobradores(String nome, String cpf, int id) {
        super(nome, cpf, id);
    }

    public void consultandoCobrador() {
        consultaEmSaldo.consultandoEmSaldo();
    }

    public void sacandoCobrador() {
        saqueEmDinheiro.sacandoEmDinheiro();
    }

}
