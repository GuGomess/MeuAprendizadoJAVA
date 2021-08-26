package br.fiap.cargo;

import br.fiap.comissao.Comissao_INTERFACE;

public enum Cargo_ENUMERATOR implements Comissao_INTERFACE {
	ATENDENTE {
		public double calcularComissao(double valor) {
			return valor * 0.10;
		}
	},
	VENDEDOR {
		public double calcularComissao(double valor) {
			return valor * 0.15 + 5;
		}
	},
	GERENTE {
		public double calcularComissao(double valor) {
			return valor * 0.20 + 10;
		}
	};
}