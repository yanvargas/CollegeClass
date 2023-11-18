package Entrega;

public class Endereco {
  private String rua ;
  private String cidade;
  private String estado;
  private Pessoa pessoa;
  
  //metodo construtor
  public Endereco(String rua, String cidade, String estado) {
	  this.rua=rua;
	  this.cidade=cidade;
	  this.estado=estado;
  }
  
  //Metodos Getters e Setters
  public String getRua() {
    return rua;
  }
  public void setRua(String rua) {
    this.rua = rua;
  }
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public Pessoa getPessoa() {
	  return pessoa;
  }
  
  //Metodo adicionar
  public void addPessoa(Pessoa pessoas){
	  this.pessoa=pessoas;
  }
  
 
}
