package IMC;

import java.lang.Math;

public class Pessoa {
    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / (Math.pow(this.altura, 2));
        if (imc < 20) {
            return -1;
        } else if (imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean ehMaioridade() {
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        System.out.println("Nome: " + this.nome + " | " + "Idade: " + this.idade + " | " + "ID: " + this.id + " | "
                + "Peso: " + this.peso + " | " + "Altura: " + this.altura);

        if (this.ehMaioridade()) {
            System.out.println("Voce é maior de idade");
        } else {
            System.out.println("Voce é menor de idade");
        }

        if (this.calcularIMC() == -1) {
            System.out.println("Seu IMC está abaixo de 20 e voce está abaixo do peso.");
        } else if (this.calcularIMC() == 1) {
            System.out.println("Seu IMC está acima de 20 e voce está acima do peso.");
        } else {
            System.out.println("Seu IMC está entre 20 e 25 e voce está na faixa de pesos saudável.");
        }
        return null;
    }
}
