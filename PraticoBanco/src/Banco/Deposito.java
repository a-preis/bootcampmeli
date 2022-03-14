package Banco;

public class Deposito implements Transacao{

    public void depositando() {
        if (transacaoOk()) {
            System.out.println("Fazendo um deposito");
        } else if (transacaoNaoOk()){
            System.out.println("Deposito não realizada");
        }
    }}
