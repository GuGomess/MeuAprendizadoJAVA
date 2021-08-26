package br.fiap.venda;

import br.fiap.cargo.Cargo_ENUMERATOR;
import br.fiap.funcionario.Funcionario;

public class Venda {
	private Funcionario funcionario;
	private double valor;

	public Venda(Funcionario funcionario, double valor) {
		super();
		this.funcionario = funcionario;
		this.valor = valor;
	}

	public double calcularComissao() {
		double comissao = 0;	//DECLARANDO VARIÁVEL
		
		
		//CRIA OBJETO ENUMERATOR E ASSOCIA ELE
		Cargo_ENUMERATOR cargo = funcionario.getCargo();	//PEGANDO 'ENUMERATOR'
		
		comissao = cargo.calcularComissao(valor);
		
		
		
		return comissao;
	}
}