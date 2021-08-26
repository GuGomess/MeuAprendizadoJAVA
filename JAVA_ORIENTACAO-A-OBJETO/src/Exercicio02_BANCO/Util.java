package Exercicio02_BANCO;

import javax.swing.JOptionPane;

public class Util {

	// VARIAVEIS GLOBAIS
	static Cliente[] cliente = new Cliente[5];
	static int posicao = 0;

	// MENU PRINCIPAL
	public static String menuPrincipal() {
		String aux = "Escolha uma opera��o\n";
		aux += "1. Abrir conta\n";
		aux += "2. Acessar conta\n";
		aux += "3. Finalizar\n";

		return aux;
	}

	// ABRIR CONTA
	public static void abrirConta() {
		if (posicao >= 5) {
			JOptionPane.showMessageDialog(null,
					"A capacidade m�xima de clientes foi atingida. Procure uma ag�ncia ou contate o gerente ",
					"LIMITE DE CLIENTES ATINGIDO!", JOptionPane.WARNING_MESSAGE);
		} else {
			String nome, cpf;
			nome = JOptionPane.showInputDialog(null, "Informe seu nome", "Abrir conta.", JOptionPane.QUESTION_MESSAGE);
			cpf = JOptionPane.showInputDialog(null, "Informe seu CPF", "Abrir conta.", JOptionPane.QUESTION_MESSAGE);
			cliente[posicao] = new Cliente(nome, cpf);
			posicao++;
		}
	}

	// ACESSAR CONTA
	public static void acessarConta() {
		double valor = 0;
		String acessar;
		int opcao, resposta;

		acessar = (JOptionPane.showInputDialog(null, "Informe seu CPF"));

		for (Cliente cliente : cliente) {
			if (acessar.equalsIgnoreCase(cliente.cpf)) {

				do {
					opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Conta: " + cliente.conta.numero + "\n" + "1. Saldo\n2. Depositar\n3. Sacar\n4. Sair ",
							"Bem vindo(a) " + cliente.nome, JOptionPane.INFORMATION_MESSAGE));

					switch (opcao) {
					case 1: // SALDO
						JOptionPane.showMessageDialog(null, "Seu saldo: " + cliente.conta.saldo, "Saldo",
								JOptionPane.INFORMATION_MESSAGE);
						break;

					case 2: // DEP�SITO
						if (valor < 0) {
							JOptionPane.showMessageDialog(null, "Digite um valor v�lido.", "ALERTA",
									JOptionPane.WARNING_MESSAGE);
						} else {
							valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do dep�sito",
									"DEP�SITO", JOptionPane.INFORMATION_MESSAGE));
							cliente.conta.depositar(valor);
						}
						break;

					case 3: // SAQUE
						valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do saque", "SAQUE",
								JOptionPane.INFORMATION_MESSAGE));
						// VALIDA��O
						if (valor < 0) {
							JOptionPane.showMessageDialog(null, "Insira um valor v�lido.", "ALERTA",
									JOptionPane.WARNING_MESSAGE);

						} else {
							cliente.conta.sacar(valor);
						}
						break;

					case 4: // SAIR
						resposta = JOptionPane.showConfirmDialog(null, "Certeza que deseja finalizar a opera��o?");
						if (resposta != 0) {
							opcao = -1;
						} else {
							menuPrincipal();

						}
						break;
					default:
						JOptionPane.showMessageDialog(null, "Op��o inv�lida.");
					}
				} while (opcao != 4);

				return;
			}
		}
		JOptionPane.showMessageDialog(null, "CPF n�o encontrado", "ERRO", JOptionPane.ERROR_MESSAGE);
	}
}