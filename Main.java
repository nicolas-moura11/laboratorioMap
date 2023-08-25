package map2;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("Nícolas", 12345);
        Aluno aluno2 = new Aluno("David", 12346);
        
        
        Professor professor1 = new Professor("Sabrina");
        Disciplina disciplina1 = new Disciplina("MAP", "09:00");
        Disciplina disciplina2 = new Disciplina("APS", "11:00");

        // matriculando alunos na disciplina
        disciplina1.matricularAluno(aluno1);
        disciplina1.matricularAluno(aluno2);
        disciplina2.matricularAluno(aluno1);

        // atribuindo disciplina ao professor
        professor1.atribuirDisciplina(disciplina1);
        professor1.atribuirDisciplina(disciplina2);

        // exibindo informações
        System.out.println("Docente " + professor1.getNome() + " está ministrando as disciplinas:");
        for (Disciplina d : professor1.getDisciplinasMinistradas()) {
            System.out.println(d.getNome());
        }
        
        //exibindo horários
        System.out.println("\nHorário do docente " + professor1.getNome() + ":");
        for (Disciplina d : professor1.getDisciplinasMinistradas()) {
            System.out.println(d.getNome() + " - Horário: " + d.getHorarioInicioAula());
        }
        
        System.out.println("\nLista de alunos da disciplina " + disciplina1.getNome() + ":");
        List<Aluno> alunosMatriculados = disciplina1.listarAlunosMatriculados();

        // itera sobre a lista de alunos matriculados e exibe
        for (Aluno aluno : alunosMatriculados) {
         System.out.println("\nNome: " + aluno.getNome() + ", Matrícula: " + aluno.getId());
        }

        System.out.println("\nDisciplinas de " + aluno1.getNome() + ":");
        for (Disciplina d : aluno1.getDisciplinasMatriculadas()) {
            System.out.println(d.getNome());
        }

        System.out.println("\nHorários de aula do dicente " + aluno1.getNome() + ":");
        for (Disciplina d : aluno1.getDisciplinasMatriculadas()) {
            System.out.println(d.getNome() + " - Horário: " + d.getHorarioInicioAula());
        }
        
        System.out.println("\nNúmero de alunos na disciplina " + disciplina1.getNome() + ": " + disciplina1.getAlunosMatriculados().size());
    }
}
