package Exercicio02_BANCO;

public class Cliente {

	//ATRIBUTOS
	String nome, cpf;
	Conta conta;
	CartaoDeCredito cartao;
	
	//CONSTRUTOR
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta	 = new Conta();
		this.cartao = new CartaoDeCredito();
	}
	
	//MÉTODO
	public String retornarDados(){
		String aux = "";
		aux += "Cliente:" + nome + "/n";
		aux += "CPF:  "+ cpf+ "/n";	
		return aux;
		}
}