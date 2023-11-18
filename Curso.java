package Entrega;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Professor> getProfessor() {
        return professores;
    }
    public List<Aluno> getAluno() {
        return alunos;
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void imprimir() {
    	System.out.println("Nome: "+ getNome());
    	
    	if(!professores.isEmpty()) {
    		System.out.println("Professores associados:");
    		for(Professor professor: professores) {
    			System.out.println("- Professor: "+professor.getNome());
    		}
    	}else {
    		System.out.println("Este curso não tem professores associados!");
    	}
    	
    	if(!alunos.isEmpty()) {
    		System.out.println("Alunos Inscritos: ");
    		for (Aluno aluno: alunos) {
    			System.out.println("- Aluno: "+ aluno.getNome());
    		}
    	}else {
    		System.out.println("Este curso não tem alunos incritos!");
    	}
    	
    }
}
