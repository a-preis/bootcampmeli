import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {

        ArrayList<Produtos> produtos = new ArrayList<>();
        Pereciveis produto1 = new Pereciveis("Picanha", 40.0, 6);
        Pereciveis produto2 = new Pereciveis("Presunto", 8.0, 3);
        Pereciveis produto3 = new Pereciveis("Queijo", 9.0, 2);
        Pereciveis produto4 = new Pereciveis("Requeijao", 7.0, 1);
        Pereciveis produto5 = new Pereciveis("Laranja", 5.0, 1);

        NaoPereciveis produto6 = new NaoPereciveis("Macarrao", 15.0, "p");
        NaoPereciveis produto7 = new NaoPereciveis("Feijao", 15.0, "p");
        NaoPereciveis produto8 = new NaoPereciveis("Arroz", 20.0, "p");
        NaoPereciveis produto9 = new NaoPereciveis("Leite", 4.0, "p");
        NaoPereciveis produto10 = new NaoPereciveis("Trigo", 12.0, "p");

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        produtos.add(produto6);
        produtos.add(produto7);
        produtos.add(produto8);
        produtos.add(produto9);
        produtos.add(produto10);

        for (Produtos produto : produtos) {
            System.out.println(produto.toString());
        }

        double precoTotalPereciveis = produto1.calcular(3) + produto2.calcular(2)
                + produto3.calcular(4) + produto4.calcular(1)
                + produto6.calcular(6);

        double precoTotalNaoPereciveis = produto6.calcular(3) + produto7.calcular(2)
                + produto8.calcular(4) + produto9.calcular(1)
                + produto10.calcular(6);

        System.out.println("Preco total dos produtos pereciveis: " + precoTotalPereciveis);
        System.out.println("Preco total dos produtos não pereciveis: " + precoTotalNaoPereciveis);

    }
}