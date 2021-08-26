package Exercicio02_BANCO;

public class funcionario {
	//ATRIBUTOS
	String cpf, nome;
	double salario;
	
	//MÉTODO
	public String retornarDados() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "CPF: " + cpf + "\n";
		aux += "Salário:" + salario;
		return aux;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario *= porcentagem;
	}
}
