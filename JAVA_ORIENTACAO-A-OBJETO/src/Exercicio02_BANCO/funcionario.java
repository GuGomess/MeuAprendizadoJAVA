package Exercicio02_BANCO;

public class funcionario {
	//ATRIBUTOS
	String cpf, nome;
	double salario;
	
	//M�TODO
	public String retornarDados() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "CPF: " + cpf + "\n";
		aux += "Sal�rio:" + salario;
		return aux;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario *= porcentagem;
	}
}
