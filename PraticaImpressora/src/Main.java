public class Main {

    public static void main(String[] args) {

        Curriculo curriculo = new Curriculo("Curriculo", "Ana", "1111-1111", "ana@gmail.com");
        LivrosPdf livropdf = new LivrosPdf("Livro Pdf", 80, "Fernando", 8, "Ação");
        Relatorios relatorio = new Relatorios("relatorio", "lalalalalal", 15, "João", "Juliette");

        curriculo.imprimir();
        livropdf.imprimir();
        relatorio.imprimir();

    }
}
