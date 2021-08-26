package Exercicio02_BANCO;

import java.util.Random;

public class Conta {
	
	//ATRIBUTOS
	int 	numero;
	double 	saldo; 
	double 	limite;
	
	//CONSTRUTOR
	public Conta() {
		this.numero = gerarNumero();
		this.saldo=0;
		this.limite = 1500.00;
	}
	
	//MÉTODOS
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

	public double consultarSaldo() {
		return saldo;
	}
	
	public int gerarNumero() {
		Random gerador = new Random();
		int numero = gerador.nextInt(1000) + 1000;
		return numero;
	}
}