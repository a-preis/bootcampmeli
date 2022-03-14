package Animal;

public class Gato extends Animal{

    public Gato(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    @Override
    public void emiteSom() {
        System.out.println(getNome() + " diz: Miau");
    }
}
