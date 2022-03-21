package modules;

import java.math.BigDecimal;

public class Veiculo {

    private double velocidade;
    private double aceleracao;
    private double anguloGiro;
    private String placa;
    private double peso;
    private Integer rodas;

    public Veiculo(double velocidade, double aceleracao, double anguloGiro, String placa, double peso, Integer rodas) {
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

    public double getVelocidade() {
        return velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public String getPlaca() {
        return placa;
    }

    public double getAnguloGiro() {
        return anguloGiro;
    }

    public double getPeso() {
        return peso;
    }

    public Integer getRodas() {
        return rodas;
    }
}
