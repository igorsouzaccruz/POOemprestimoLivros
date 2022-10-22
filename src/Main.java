import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Alunos aluno01 = new Alunos(10,"Ang","a@mail.com",8922,"Letras","Manhã");
       Alunos aluno02 = new Alunos(11,"Katara","k@mail.com",9833,"Música","Tarde");

       Professores professor01 = new Professores(2,"Lord Ozai","c@gmail.com",9875,"Mestre");

       Livros livros01 = new Livros(3,"Fogo","lele",2019,4);
       Livros livros02 = new Livros(4,"Ar","lala",2018,3);
       Livros livros03 = new Livros(5,"Água","lolo",2017,2);
       Livros livros04 = new Livros(6,"Terra","lili",2016,1);
       Livros livros05 = new Livros(7,"Coração","lulu",2015,0);

       List<Livros> listaDeLivros1 = new ArrayList<>();
       listaDeLivros1.add(livros01);
       listaDeLivros1.add(livros02);
       listaDeLivros1.add(livros03);

       List<Livros> listaDeLivros2 = new ArrayList<>();
       listaDeLivros2.add(livros04);

       List<Livros> listaDeLivros3 = new ArrayList<>();
       listaDeLivros3.add(livros05);


       Emprestimo emprestimo = new Emprestimo();


       System.out.println(emprestimo.emprestimo(listaDeLivros2,aluno01));
       System.out.println(emprestimo.emprestimo(listaDeLivros3,aluno02));
       System.out.println(emprestimo.emprestimo(listaDeLivros1,professor01));

       System.out.println(emprestimo.devolver(livros01));
    }
}