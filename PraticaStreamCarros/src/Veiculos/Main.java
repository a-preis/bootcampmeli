package Veiculos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Veiculo veiculo1 = new Veiculo("Ford", "Fiesta", 1000);
        Veiculo veiculo2 = new Veiculo("Ford", "Focus", 1200);
        Veiculo veiculo3 = new Veiculo("Ford", "Explorer", 2500);
        Veiculo veiculo4 = new Veiculo("Fiat", "Uno", 500);
        Veiculo veiculo5 = new Veiculo("Fiat", "Cronos", 1000);
        Veiculo veiculo6 = new Veiculo("Fiat", "Torino", 1250);
        Veiculo veiculo7 = new Veiculo("Chevrolet", "Aveo", 1250);
        Veiculo veiculo8 = new Veiculo("Chevrolet", "Spin", 2500);
        Veiculo veiculo9 = new Veiculo("Toyota", "Corola", 1200);
        Veiculo veiculo10 = new Veiculo("Toyota", "Fortuner", 3000);
        Veiculo veiculo11 = new Veiculo("Renault", "Logan", 950);

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(veiculo1);
        listaVeiculos.add(veiculo2);
        listaVeiculos.add(veiculo3);
        listaVeiculos.add(veiculo4);
        listaVeiculos.add(veiculo5);
        listaVeiculos.add(veiculo6);
        listaVeiculos.add(veiculo7);
        listaVeiculos.add(veiculo8);
        listaVeiculos.add(veiculo9);
        listaVeiculos.add(veiculo10);
        listaVeiculos.add(veiculo11);

        Garagem garagem = new Garagem(1, listaVeiculos);

        // Compara do maior ao menor preço
        listaVeiculos.sort(Comparator.comparing(Veiculo::getPreco));
        listaVeiculos.forEach(System.out::println);

        // Compara por ordem alfabética de marcas
        listaVeiculos.sort(Comparator.comparing(Veiculo::getMarca));
        listaVeiculos.forEach(System.out::println);

        // Só os que custam < 1000
        listaVeiculos.stream().filter(number -> number.getPreco() < 1000).forEach(System.out::println);

        // Só os que custam <= 1000
        listaVeiculos.stream().filter(number -> number.getPreco() >= 1000).forEach(System.out::println);

        // Media total dos preços
        int soma = listaVeiculos.stream().mapToInt(number -> number.getPreco()).sum();
        System.out.println(soma / listaVeiculos.size());
    }
}
