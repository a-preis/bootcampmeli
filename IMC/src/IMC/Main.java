package IMC;

public class Main {

    public static void main(String args[]) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Ana", 28, "1");
        Pessoa pessoa3 = new Pessoa("João", 24, "2", 89, 1.70);

        // Pessoa pessoa4 = new Pessoa("José", 45); no suitable constructor found for Pessoa(java.lang.String,int)
        //    constructor IMC.Pessoa.Pessoa() is not applicable

        pessoa3.calcularIMC();
        pessoa3.toString();
    }
}
