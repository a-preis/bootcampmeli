import java.security.AlgorithmConstraints;

public class PraticaExcecoes {
    private static int a = 0;
    private static int b = 300;

    public static void main(String[] args) {
        divisao(a,b);
    }

    public static void divisao(int a, int b) throws ArithmeticException{

        try {
            if(a == 0) {
                throw new ArithmeticException("Nao pode ser dividido por zero");
            }
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
