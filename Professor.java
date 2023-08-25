package map2;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	 private String nome;
	    private List<Disciplina> disciplinasMinistradas;

	    public Professor(String nome) {
	        this.nome = nome;
	        this.disciplinasMinistradas = new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public List<Disciplina> getDisciplinasMinistradas() {
	        return disciplinasMinistradas;
	    }

	    public void atribuirDisciplina(Disciplina disciplina) {
	        disciplinasMinistradas.add(disciplina);
	        disciplina.setProfessorResponsavel(this);
	    }

	    public void removerDisciplina(Disciplina disciplina) {
	        disciplinasMinistradas.remove(disciplina);
	        disciplina.setProfessorResponsavel(null);
	    }
}