package Veiculos;

import java.util.List;

public class Garagem {

    private int id;
    private List<Veiculo> veiculos;

    public Garagem(int id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public int getId() {
        return id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return "Garagem{" +
                "id=" + id +
                ", veiculos=" + veiculos.toString() +
                '}';
    }
}
