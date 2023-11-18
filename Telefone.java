package Entrega;

public class Telefone {
  private String tipo;
  private String ddd ;
  private String numero;
  private Pessoa pessoas;
  
  //Construtor
  public Telefone(String numero, String tipo, String ddd) {
	  this.numero = numero;
	  this.tipo = tipo;
	  this.ddd = ddd;
  }
  
  //Metodos Getters
  public String getTipo() {
    return tipo;
  }
  public String getDdd() {
    return ddd;
  }
  public String getNumero() {
    return numero;
  }
  public Pessoa getPessoa() {
	  return pessoas;
  }
  
  //Metodos Setters
  public void setTipo(String tipo) {
	  this.tipo = tipo;
  }
  public void setDdd(String ddd) {
	  this.ddd = ddd;
  }
  public void setNumero(String numero) {
	  this.numero=numero;
  }
  	//add para o associado da class pessoa
	  public void addPessoa(Pessoa pessoas) {
		  this.pessoas = pessoas;
		  pessoas.addTelefone(this);
	  }
}

