package Animal;

public abstract class Animal implements EmitirSom, Comer{

    private String nome;
    private String cor;
    private String especie;

    public Animal(String nome, String cor, String especie) {
        this.nome = nome;
        this.cor = cor;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void comerAnimal(Animal objeto){
        objeto.comer();
    }

}
