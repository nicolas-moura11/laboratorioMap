package map2;

import java.util.List;

public class Aluno {
	
	 private String nome;
	    private int id;
	    private int idade;
	    private List<Disciplina> disciplinasMatriculadas;
	    

	    public Aluno(String nome,int id, int idade) {
	    	this.nome = nome;
	    	this.id = id;
	    	this.idade = idade;
	    }
	    
	    public String getNome() {
	    	return nome;
	    }
	    
	    public int getId() {
	    	return id;
	    }
	    
	    public int idade() {
	    	return idade;
	    }

	    public List<Disciplina> getDisciplinasMatriculadas() {
	        return disciplinasMatriculadas;
	    }

	    public void adicionarDisciplina(Disciplina disciplina) {
	        disciplinasMatriculadas.add(disciplina);
	    }

	    public void removerrDisciplina(Disciplina disciplina) {
	        disciplinasMatriculadas.remove(disciplina);
	    }
	
}
