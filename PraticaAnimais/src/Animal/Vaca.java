package Animal;

public class Vaca extends Animal{

    public Vaca(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    @Override
    public void emiteSom() {
        System.out.println(getNome() + " diz: Muuu");
    }
}
