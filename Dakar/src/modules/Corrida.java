package modules;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private Integer numVeiculos;
    private List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

    public Corrida(double distancia, double premioEmDolares, String nome, Integer numVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.numVeiculos = numVeiculos;
    }

    public void addCarro(BigDecimal velocidade, BigDecimal aceleracao, double anguloGiro, String placa){
        if (listaVeiculos.size() < numVeiculos) {
            Carro carro = new Carro(velocidade, aceleracao, anguloGiro, placa);
            listaVeiculos.add(carro);
        } else {
            System.out.println("Lista de veículos na corrida está cheia!");
        }

    }

    public void addMoto(BigDecimal velocidade, BigDecimal aceleracao, double anguloGiro, String placa){
        if (listaVeiculos.size() < numVeiculos) {
            Moto moto = new Moto(velocidade, aceleracao, anguloGiro, placa);
            listaVeiculos.add(moto);
        } else {
            System.out.println("Lista de veículos na corrida está cheia!");
        }

    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", numVeiculos=" + numVeiculos +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumVeiculos() {
        return numVeiculos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
}
