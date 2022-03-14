
public class Relatorios extends Documento {

    private String texto;
    private int numPaginas;
    private String autor;
    private String revisor;

    public Relatorios(String tipo, String texto, int numPaginas, String autor, String revisor) {
        super(tipo);
        this.texto = texto;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getTexto() {
        return texto;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo  ...  " + this.toString());
    }

    @Override
    public String toString() {
        return "Relatorios{" +
                "texto='" + texto + '\'' +
                ", numPaginas=" + numPaginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }
}
