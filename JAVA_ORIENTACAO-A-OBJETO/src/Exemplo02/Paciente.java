package Exemplo02;

public class Paciente {
	// ATRIBUTOS
	String nome;
	int idade;

	// MÉTODO CONSTRUTOR
	//1 - NÃO TEM TIPO (STATIC OU VOID)
	//2 - TEM MESMO NOME DA CLASSE
	public Paciente(String nome, int idade) {
		this.nome = nome;			//THIS: UTILIZADO PARA REFERENCIAR A VARIAVEL GLOBAL (DOS ATRIBUTOS)
		this.idade = idade;			//UTILIZAR QUANDO OS NOMES DAS VARIAVEIS SÃO IGUAIS.
	}
	
	// MÉTODO PARA CALCULAR E RETORNAR A FREQUÊNCIA MÁXIMA
	public int frequenciaMaxima() {
		return (220 - idade);
	}

	// MÉTODO PARA CALCULAR E RETORNAR A FREQUÊNCIA ALVO
	public double[] frequenciaAlvo() {
		double[] alvo = new double[2];
		int maxima = frequenciaMaxima();
		alvo[0] = maxima * 0.5;
		alvo[1] = maxima * 0.85;
		return alvo;
	}
}