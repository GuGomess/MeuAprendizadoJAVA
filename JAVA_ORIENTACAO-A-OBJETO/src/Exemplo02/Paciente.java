package Exemplo02;

public class Paciente {
	// ATRIBUTOS
	String nome;
	int idade;

	// M�TODO CONSTRUTOR
	//1 - N�O TEM TIPO (STATIC OU VOID)
	//2 - TEM MESMO NOME DA CLASSE
	public Paciente(String nome, int idade) {
		this.nome = nome;			//THIS: UTILIZADO PARA REFERENCIAR A VARIAVEL GLOBAL (DOS ATRIBUTOS)
		this.idade = idade;			//UTILIZAR QUANDO OS NOMES DAS VARIAVEIS S�O IGUAIS.
	}
	
	// M�TODO PARA CALCULAR E RETORNAR A FREQU�NCIA M�XIMA
	public int frequenciaMaxima() {
		return (220 - idade);
	}

	// M�TODO PARA CALCULAR E RETORNAR A FREQU�NCIA ALVO
	public double[] frequenciaAlvo() {
		double[] alvo = new double[2];
		int maxima = frequenciaMaxima();
		alvo[0] = maxima * 0.5;
		alvo[1] = maxima * 0.85;
		return alvo;
	}
}