package Entrega;
import java.util.List;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    Pessoa pessoa1 = new Pessoa("Joao", "061456543-34", "joao345@gmail.com");
    Pessoa pessoa2 = new Pessoa("Tim Bergling", "06533302-54", "avicii@hotmail.com");
    Telefone telefone1 = new Telefone("99943-5678", "movel", "062");
    Telefone telefone2 = new Telefone("95634-9801", "fixo", "062");
    Endereco endereco1 = new Endereco("Avenida Brasil", "Rio de Janeiro", "Rio de Janeiro");
    Curso curso1 = new Curso("Logica Matematica");
    Curso curso2 = new Curso("Calculo I");
    Curso curso3 = new Curso("Orientacao a Objeto");
    Professor professor1=new Professor("Sebastião", "065432234-43", "Seb@gmail.com", "X34556", 22.234 );
    Professor professor2=new Professor("Henrique", "342228932-91", "HenriqueOficial@gmail.com", "X42345", 19.784 );
    Double[] notasDoAluno = { 8.5, 9.0, 7.5 };
    Aluno aluno1=new Aluno("Artur", "065663654-98", "Artur443@gmail.com", notasDoAluno );
    
    pessoa1.addTelefone(telefone2);
    pessoa1.addEndereco(endereco1);
    
    telefone1.addPessoa(pessoa2);
    
    professor1.addCurso(curso1);
    professor1.addCurso(curso3);
    professor2.addCurso(curso2);
   
    aluno1.addCurso(curso2);
    aluno1.addCurso(curso3);
    
    System.out.println("----------------------------------");
    professor1.imprimir();
    System.out.println("----------------------------------");
    aluno1.imprimir();
    System.out.println("----------------------------------");
    curso3.imprimir();
  }
    
}
