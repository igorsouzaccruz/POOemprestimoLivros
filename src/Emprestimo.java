import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private List<Livros> livrosEmprestados = new ArrayList<>();


    public String emprestimo(List<Livros> livros, Pessoas pessoa){
        boolean isAluno = pessoa instanceof Alunos;
        boolean isProfessor = pessoa instanceof Professores;

        int numeroDeLivros = livros.size();

        List<String> nomeLivrosEmprestados = new ArrayList<>();
        int index = 1;
        for (Livros livro:livros) {
            nomeLivrosEmprestados.add("Livro " + index + ": " + livro.getTitulo());
            index++;
            this.livrosEmprestados.add(livro);
        }

        boolean limiteLivrosAlunos = numeroDeLivros < 4;
        boolean limiteLivrosProfessores = numeroDeLivros < 6;

        int prazo = 0;
        String resultado = "";

        if(isAluno && limiteLivrosAlunos){
            prazo = 10;
        }
        if(isProfessor && limiteLivrosProfessores){
            prazo = 30;
        }

        resultado = "Foram emprestados: " + numeroDeLivros + ".\n" +
                "Os livros emprestados foram: " + nomeLivrosEmprestados + ".\n" +
                "Quem realizou o empréstimo: " + pessoa.getNome() + ".\n" +
                "O prazo de devolução é: " + prazo + ".\n";
        return  resultado;
    }

    public String devolver(Livros livro){

        this.livrosEmprestados.removeIf(x -> x.getTitulo() == livro.getTitulo());

        int index = 1;
        List<String> nomesEmprestimoAtivo = new ArrayList<>();

        for (Livros liv:this.livrosEmprestados) {
            nomesEmprestimoAtivo.add("Livro " + index + ": " + liv.getTitulo());
            index++;
        }
        String resultado = "Livro removido: " + livro.getTitulo() + ".\n" +
                "Emprestimos ativos: " + nomesEmprestimoAtivo;

        return resultado;
    }
}
