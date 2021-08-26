package Exercicio02_BANCO;

import javax.swing.JOptionPane;

public class Principal2 {

	static Cliente cliente;

	public static void main(String[] args) {

		int opcao, resposta;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, Util.menuPrincipal(), "Bem vindo(a)", JOptionPane.QUESTION_MESSAGE));
			switch (opcao) {
			case 1:
				Util.abrirConta();
				break;
			case 2:
				Util.acessarConta();
				break;
			case 3:
				resposta = JOptionPane.showConfirmDialog(null, "Certeza que deseja finalizar a aplicação?");
				if (resposta != 0) {
					opcao--;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}

		} while (opcao != 3);
	}
}