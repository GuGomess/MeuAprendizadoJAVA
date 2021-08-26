package Exercicio03_LOCACAO;

public class Autor {

	String nome, cidade;
	int idade, qtdLivros;
	
	
	
	public String dados() {
		String aux = "";
		aux += "NOME: " + nome + "\n";
		aux += "CIDADE: " + cidade + "\n";
		aux += "IDADE: " + idade + "\n";
		aux += "QTD LIVROS: " + qtdLivros + "\n";
		return aux;
	}
	
}