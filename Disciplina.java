package map2;

import java.util.ArrayList;
import java.util.List;



public class Disciplina {
    private String nome;
    private String horarioInicioAula;
    private Professor professorResponsavel;
    private List<Aluno> alunosMatriculados;

    public Disciplina(String nome, String horarioInicioAula) {
        this.nome = nome;
        this.horarioInicioAula = horarioInicioAula;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getHorarioInicioAula() {
        return horarioInicioAula;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professor) {
        this.professorResponsavel = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public boolean matricularAluno(Aluno aluno) {
        if (alunoChoqueHorario(aluno)) {
            return false;
        }

        if (alunoJaEstaMatriculado(aluno)) {
            return false;
        }

        if (aluno.temConflitoHorario(this.horarioInicioAula)) {
            System.out.println("O aluno já está matriculado em uma disciplina neste horário.");
            return false;
        }

        alunosMatriculados.add(aluno);
        aluno.matricularDisciplina(this);
        return true;
    }
    
    public boolean verificaChoqueHorario(Aluno aluno) {
        for (Disciplina d : aluno.getDisciplinasMatriculadas()) {
            if (d.getHorarioInicioAula().equals(this.horarioInicioAula)) {
                System.out.println("O aluno " + aluno.getNome() + " já está matriculado em uma disciplina neste horário.");
                return true; // há um choque de horário
            }
        }
        return false; 
    }

    private boolean alunoChoqueHorario(Aluno aluno) {
        for (Disciplina d : aluno.getDisciplinasMatriculadas()) {
            if (d.getHorarioInicioAula().equals(this.horarioInicioAula)) {
                return true;
            }
        }
        return false;
    }
    
    public List<Aluno> listarAlunosMatriculados() {
        return alunosMatriculados;
    }

    private boolean alunoJaEstaMatriculado(Aluno aluno) {
        if (alunosMatriculados.contains(aluno)) {
            System.out.println("O aluno " + aluno.getNome() + " já está matriculado nesta disciplina.");
            return true;
        }
        return false;
    }
    
}
