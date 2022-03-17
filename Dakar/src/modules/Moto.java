package modules;

import java.math.BigDecimal;

public class Moto extends Veiculo{

    private static final BigDecimal pesoMoto = BigDecimal.valueOf(300.0);
    private static final int rodas = 2;

    public Moto(BigDecimal velocidade, BigDecimal aceleracao, double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, pesoMoto, rodas);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
