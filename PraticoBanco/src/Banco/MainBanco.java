package Banco;

public class MainBanco {

    public static void main(String[] args) {

        Basico clienteBasico = new Basico("João", "11111111", 1);
        Executivos clienteExecutivo = new Executivos("Ana", "22222222", 2);
        Cobradores clienteCobrador = new Cobradores("Silvio", "33333333", 3);

        clienteBasico.saqueBasico();
        clienteBasico.pagamentoBasico();
        clienteBasico.consultaBasico();


        clienteExecutivo.depositoExecutivo();
        clienteExecutivo.transferenciaExecutivo();

        clienteCobrador.sacandoCobrador();
        clienteCobrador.consultandoCobrador();
    }
}
