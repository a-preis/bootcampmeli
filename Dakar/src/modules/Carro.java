package modules;

import java.math.BigDecimal;

public class Carro extends Veiculo{

    private static final BigDecimal pesoCarro = BigDecimal.valueOf(1000.0);
    private static final int rodas = 4;

    public Carro(BigDecimal velocidade, BigDecimal aceleracao, double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, pesoCarro, rodas);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
