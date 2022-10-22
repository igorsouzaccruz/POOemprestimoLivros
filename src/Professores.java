public class Professores extends Pessoas{
    private String titulacao;

    public Professores(Integer matricula, String nome, String email, Integer telefone, String titulacao) {
        super(matricula, nome, email, telefone);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
