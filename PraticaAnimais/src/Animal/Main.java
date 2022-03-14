package Animal;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Toby", "Caramelo", "Vira-Lata");
        Gato gato1 = new Gato("Tulipa", "Malhada", "Vira-Lata");
        Vaca vaca1 = new Vaca("Josefina", "Preta", "Holandesa");

        cachorro1.emiteSom();
        gato1.emiteSom();
        vaca1.emiteSom();
    }
}
