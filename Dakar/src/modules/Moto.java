package modules;

import java.math.BigDecimal;

public class Moto extends Veiculo {

    private static final double pesoMoto = 300.0;
    private static final int rodas = 2;

    public Moto(double velocidade, double aceleracao, double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, pesoMoto, rodas);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
