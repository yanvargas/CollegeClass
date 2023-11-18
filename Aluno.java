package Entrega;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
  private Double[] notas;
  private List<Curso> cursos;
  //private Professor professor;
  
  public Aluno (String nome, String cpf, String email, Double[] notas) {
	  super(nome,cpf,email);
	  this.notas=notas;
	  this.cursos = new ArrayList<>();
  }
  
  public Double[] getNotas() {
    return notas;
  }
  public void setNotas(Double[] notas) {
	    this.notas=notas;
  }
  
  public void addCurso(Curso curso) {
	  cursos.add(curso);
  }
  
  public void imprimir() {
  	System.out.println("Nome: "+ getNome());
  	System.out.println("CPF: "+ getCpf());
  	System.out.println("Email: "+ getEmail());
  	
  	if(notas != null && notas.length>0){
  		System.out.println("Notas:");
  		for(int i =0; i< notas.length; i++){
  			System.out.println("- Nota "+ (i+1) + ": "+ notas[i]);
  		}
  	} else {
  		System.out.println("o aluno não possui notas registradas!");
  	}
  	if(!cursos.isEmpty()) {
  		System.out.println("Cursos incrito:");
  		for (Curso curso : cursos) {
  			System.out.println("- Curso: " + curso.getNome());
  		}
  	} else {
  		System.out.println("O aluno não está associado a nenhum curso!");
  	}
  	System.out.println("----------------------------------");
  }
}
