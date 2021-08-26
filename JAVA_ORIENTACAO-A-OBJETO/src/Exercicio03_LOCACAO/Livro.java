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

//Escreva também a classe Livro que tenha como atributos o título do livro, o gênero e uma
//variável de referência do tipo Autor, ou seja, a classe Livro tem como atributo um objeto do
//tipo Autor. A classe Livro deverá ter um método para retornar todos os dados de um livro.
//Codifique a classe principal para testar a classe Livro. Gere pelo menos dois objetos da classe
//Livro. Faça a entrada de dados via teclado e na sequência imprima todos os dados de cada livro
//no vídeo.