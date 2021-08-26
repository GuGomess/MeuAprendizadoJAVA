package br.fiap.main;

import br.fiap.cargo.Cargo_ENUMERATOR;
import br.fiap.funcionario.Funcionario;
import br.fiap.venda.Venda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venda venda = new Venda(new Funcionario("GUSTAVO", 1000, Cargo_ENUMERATOR.VENDEDOR), 1000);
		System.out.println(venda.calcularComissao());
		
	
		
	}

}
