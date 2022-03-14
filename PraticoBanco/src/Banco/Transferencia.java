package Banco;

public class Transferencia implements Transacao{

    public void transferindo() {
        if (transacaoOk()) {
            System.out.println("Fazendo uma transferencia");
        } else if (transacaoNaoOk()){
            System.out.println("Transferencia não realizada");
        }
    }}
