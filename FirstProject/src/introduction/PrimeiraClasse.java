package introduction;

import java.util.Arrays;

public class PrimeiraClasse {

    public static void main(String args[]) {

        String[] cidades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temp[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int minTemp = temp[0][0];
        int maxTemp = 0;
        int linhaMin = 0;
        int linhaMax = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (temp[i][j] > maxTemp) {
                    maxTemp = temp[i][j];
                    linhaMax = i;
                }
                if (temp[i][j] < minTemp) {
                    minTemp = temp[i][j];
                    linhaMin = i;
                }
            }
        }

        System.out.println("A cidade com a maior temperatura é: " + cidades[linhaMax]);
        System.out.println("A cidade com a maior temperatura é: " + cidades[linhaMin]);

    }
}
