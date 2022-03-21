import java.util.ArrayList;

public class Curriculo extends Documento {

    private String nome;
    private String telefone;
    private String email;
    private ArrayList<String> habilidades = new ArrayList<String>();

    public Curriculo(String tipo, String nome, String telefone, String email) {
        super(tipo);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void incluiHabilidade(String novaHabilidade) {
        habilidades.add(novaHabilidade);
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo  ...  " + this.toString());
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", habilidades=" + habilidades +
                '}';
    }
}
