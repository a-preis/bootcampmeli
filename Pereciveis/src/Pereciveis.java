public class Pereciveis extends Produtos{

    int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double precoFinal = super.calcular(quantidadeDeProdutos);
        switch (diasParaVencer) {
            case 1:
                return precoFinal / 4;
            case 2:
                return precoFinal / 3;
            case 3:
                return precoFinal / 2;
            default:
                return precoFinal;
        }
    }
}
