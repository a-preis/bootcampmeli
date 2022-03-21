package modules;

import java.math.BigDecimal;

public class Carro extends Veiculo {

    private static final double pesoCarro = 1000.0;
    private static final int rodasCarro = 4;

    public Carro(double velocidade, double aceleracao, double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, pesoCarro, rodasCarro);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
