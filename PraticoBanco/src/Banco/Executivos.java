package Banco;

public class Executivos extends Cliente {

    Deposito deposito = new Deposito();
    Transferencia transferencia = new Transferencia();

    public Executivos(String nome, String cpf, int id) {
        super(nome, cpf, id);
    }

    public void depositoExecutivo() {
        deposito.depositando();
    }

    public void transferenciaExecutivo() {
        transferencia.transferindo();
    }
}
