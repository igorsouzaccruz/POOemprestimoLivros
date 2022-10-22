public class Alunos extends Pessoas{
    private String curso;
    private String turno;

    public Alunos(Integer matricula, String nome, String email, Integer telefone, String curso, String turno) {
        super(matricula, nome, email, telefone);
        this.curso = curso;
        this.turno = turno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
