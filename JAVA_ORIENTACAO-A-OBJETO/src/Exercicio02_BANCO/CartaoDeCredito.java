package Exercicio02_BANCO;

import java.util.Random;

public class CartaoDeCredito {
	// ATRIBUTOS
	int numero;
	double totalFatura;

	// CONSTRUTOR
	public CartaoDeCredito() {
		this.numero = gerarNumero();
		this.totalFatura = 0;
	}

	// MÉTODOS
	public double consultarFatura() {
		return totalFatura;
	}

	public String retornarDados() {
		String aux = "";
		aux += "Número do cartão: " + numero + "\n";
		aux += "Valor da fatura: " + totalFatura + "\n";
		return aux;
	}

	public int gerarNumero() {
		Random gerador = new Random(); // INSTANCIANDO O OBJETO RANDOMIZER
		int numero = gerador.nextInt(9000) + 1000;
		return numero;
	}
}