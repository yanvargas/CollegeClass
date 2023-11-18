package Entrega;
import java.util.ArrayList;
import java.util.List;

public class Pessoa{
  private String nome;
  private String cpf;
  private String email;
  private Endereco endereco;
  private List<Telefone> telefones;

  //Metodo Construtor 
  public Pessoa(String nome, String cpf, String email){
	  this.nome = nome;
	  this.cpf = cpf;
	  this.email = email;  
	  
	  /*Na criação do objeto pessoa é inicializado
	   *um vetor na variavel associada*/
	  this.telefones = new ArrayList<>();
  }
 
  //Metodos Getters
  public String getNome() {
	    return nome;
	  }
  public String getCpf() {
    return cpf;
  }
  public String getEmail() {
    return email;
  }
  public Endereco getEndereco() {
	  return endereco;
  }
  public List<Telefone> getTelefones() {
	  return telefones;
  }
  
  //Metodos setters
  public void setNome(String nome) {
	  this.nome = nome;
  }
  public void setCpf(String cpf) {
	  this.cpf = cpf;
  }
  public void setEmail(String email) {
	  this.email = email;
  }
 
	  //Add para adicionar cada instancia na variavel associada
	  public void addTelefone(Telefone telefone) {
	      telefones.add(telefone); //Variavel "telefones" vai reter o valor do objeto telefone
	      telefone.addPessoa(this);
	  }
	  public void addEndereco(Endereco endereco) {
		  this.endereco=endereco;
	  }
 
}
