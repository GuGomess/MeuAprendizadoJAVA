package Exercicio03_LOCACAO;

public class Livro {

	String titulo, genero;
	Autor autor;

	public String dados() {
		String aux = "";
		aux += "TITULO: " + titulo + "\n";
		aux += "GENERO: " + genero + "\n";
		aux += "AUTOR: " + autor + "\n";
		return aux;

	}

}

//Escreva tamb�m a classe Livro que tenha como atributos o t�tulo do livro, o g�nero e uma
//vari�vel de refer�ncia do tipo Autor, ou seja, a classe Livro tem como atributo um objeto do
//tipo Autor. A classe Livro dever� ter um m�todo para retornar todos os dados de um livro.
//Codifique a classe principal para testar a classe Livro. Gere pelo menos dois objetos da classe
//Livro. Fa�a a entrada de dados via teclado e na sequ�ncia imprima todos os dados de cada livro
//no v�deo.