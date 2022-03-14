
public class LivrosPdf extends Documento {

    private int numPaginas;
    private String nomeAutor;
    private int capitulo;
    private String genero;

    public LivrosPdf(String tipo, int numPaginas, String nomeAutor, int capitulo, String genero) {
        super(tipo);
        this.numPaginas = numPaginas;
        this.nomeAutor = nomeAutor;
        this.capitulo = capitulo;
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo  ...  " + this.toString());
    }

    @Override
    public String toString() {
        return "LivrosPdf{" +
                "numPaginas=" + numPaginas +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", capitulo=" + capitulo +
                ", genero='" + genero + '\'' +
                '}';
    }
}
