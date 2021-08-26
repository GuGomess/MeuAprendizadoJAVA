package Exemplo04_Janela;

import javax.swing.JOptionPane;

public class ConversaoDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor1;
		double valor2;
		double resultado;

		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		resultado = valor1 / valor2;
		JOptionPane.showMessageDialog(null, valor1 + " / " + valor2 + " = " + String.format("%.3f", resultado), "Divisão", JOptionPane.INFORMATION_MESSAGE);
	}

}