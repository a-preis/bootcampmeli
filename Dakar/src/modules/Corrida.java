package modules;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private Integer numVeiculos;
    private List<Veiculo> listaVeiculos;
    private SalvaVidasCarro salvaVidasCarro;
    private SalvaVidasMoto salvaVidasMoto;

    public Corrida(double distancia, double premioEmDolares, String nome, Integer numVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.numVeiculos = numVeiculos;
        this.listaVeiculos = new ArrayList<Veiculo>(numVeiculos);
        this.salvaVidasCarro = new SalvaVidasCarro();
        this.salvaVidasMoto = new SalvaVidasMoto();
    }

    public void addCarro(double velocidade, double aceleracao, double anguloGiro, String placa) {
        if (listaVeiculos.size() < numVeiculos) {
            Carro carro = new Carro(velocidade, aceleracao, anguloGiro, placa);
            listaVeiculos.add(carro);
        } else {
            System.out.println("Lista de veículos na corrida está cheia!");
        }

    }

    public void addMoto(double velocidade, double aceleracao, double anguloGiro, String placa) {
        if (listaVeiculos.size() < numVeiculos) {
            Moto moto = new Moto(velocidade, aceleracao, anguloGiro, placa);
            listaVeiculos.add(moto);
        } else {
            System.out.println("Lista de veículos na corrida está cheia!");
        }

    }

    public void deleteVeiculoComPlaca(String placa){
        if (listaVeiculos.size() < 1) {
            System.out.println("Não há veículos na corrida");
            return;
        }
        int i;
        for (i = 0; i < listaVeiculos.size(); i++) {
            if (placa.equals(listaVeiculos.get(i).getPlaca())) {
                break;
            }
        }
        listaVeiculos.remove(i);
    }

    public void deleteVeiculo(Veiculo veiculo) {
        deleteVeiculoComPlaca(veiculo.getPlaca());
    }

    public Veiculo calculaVencedor() {
        if (listaVeiculos.size() > 0) {
            Veiculo veiculoComMaisPontos = listaVeiculos.get(0);
            double resultadoMaior = 0;
            for(Veiculo v : listaVeiculos) {
                double vel = v.getVelocidade();
                double acel = v.getAceleracao();
                double angulo = v.getAnguloGiro();
                double peso = v.getPeso();
                int rodas = v.getRodas();

                double resultado = (vel * (acel / 2)) / (angulo * (peso - rodas * 100));

                if (resultado > resultadoMaior) {
                    veiculoComMaisPontos = v;
                    resultadoMaior = resultado;
                }
            }
            return veiculoComMaisPontos;
        } else {
            System.out.println("Não há veículos na corrida");
            return null;
        }
    }

    public void socorrerCarro(String placa) {
        for (Veiculo v : listaVeiculos) {
            if (v.getPlaca().equals(placa) && v instanceof Carro) {
                salvaVidasCarro.socorrer((Carro) v);
            }
        }

    }

    public void socorrerMoto(String placa) {
        for (Veiculo v : listaVeiculos) {
            if (v.getPlaca().equals(placa) && v instanceof Moto) {
                salvaVidasMoto.socorrer((Moto) v);
            }
        }
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '/' +
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
