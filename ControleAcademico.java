package map2;

import java.util.List;

public class ControleAcademico {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    // Construtor e métodos

    public void matricularAlunoEmDisciplina(Aluno aluno, Disciplina disciplina) {
        aluno.adicionarDisciplina(disciplina);
    }

    public void atribuirProfessorADisciplina(Professor professor, Disciplina disciplina) {
        disciplina.setProfessorResponsavel(professor);
        professor.adicionarDisciplinaMinistrada(disciplina);
    }
