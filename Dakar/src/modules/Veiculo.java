package modules;

import java.math.BigDecimal;

public class Veiculo {

    private BigDecimal velocidade;
    private BigDecimal aceleracao;
    private double anguloGiro;
    private String placa;
    private BigDecimal peso;
    private Integer rodas;

    public Veiculo(BigDecimal velocidade, BigDecimal aceleracao, double anguloGiro, String placa, BigDecimal peso, Integer rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloGiro = anguloGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                "}\n";
    }

    public BigDecimal getVelocidade() {
        return velocidade;
    }

    public BigDecimal getAceleracao() {
        return aceleracao;
    }

    public String getPlaca() {
        return placa;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public Integer getRodas() {
        return rodas;
    }
}
