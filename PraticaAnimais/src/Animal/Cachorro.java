package Animal;

public class Cachorro extends Animal{

    public Cachorro(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    @Override
    public void emiteSom() {
        System.out.println(getNome() + " diz: Auau");
    }

    public void comer() {
        System.out.println(getNome() + " está comendo carne");
    }
}
