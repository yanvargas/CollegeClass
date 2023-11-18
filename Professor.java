package Entrega;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private List<Curso> cursos;

    public Professor(String nome, String cpf, String email, String titulacao, double salario) {
        super(nome, cpf, email);
        this.titulacao = titulacao;
        this.salario = salario;
        this.cursos = new ArrayList<>();
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }
    
    public void imprimir() {
    	System.out.println("Nome: "+ getNome());
    	System.out.println("CPF: "+ getCpf());
    	System.out.println("Email: "+ getEmail());
    	System.out.println("Titulacao: "+ getTitulacao());
    	System.out.println("Salario: "+ getSalario());
    	
    	if(!cursos.isEmpty()) {
    		System.out.println("Cursos ministrados:");
    		for (Curso curso : cursos) {
    			System.out.println("- Curso: " + curso.getNome());
    		}
    	} else {
    		System.out.println("O professor não está associado a nenhum curso!");
    	}
    	System.out.println("----------------------------------");
    }
}
