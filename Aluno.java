package map2;



import java.util.ArrayList;
import java.util.List;


public class Aluno {
    private String nome;
    private int id;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
        disciplina.matricularAluno(this);
    }

    public boolean temConflitoHorario(String horario) {
        for (Disciplina disciplina : disciplinasMatriculadas) {
            if (disciplina.getHorarioInicioAula().equals(horario)) {
                return true;
            }
        }
        return false;
    }
    
}

