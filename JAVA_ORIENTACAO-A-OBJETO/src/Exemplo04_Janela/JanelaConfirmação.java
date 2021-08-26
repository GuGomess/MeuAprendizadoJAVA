package Exemplo04_Janela;

import javax.swing.JOptionPane;

public class JanelaConfirmação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer um intervalo?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Tome um intervalo! (;");
		} else {
			JOptionPane.showMessageDialog(null, "Você não quis um intervalo.");
		}

	}

}