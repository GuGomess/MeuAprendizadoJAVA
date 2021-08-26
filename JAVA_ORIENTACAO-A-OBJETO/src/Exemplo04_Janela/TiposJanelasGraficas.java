package Exemplo04_Janela;

import javax.swing.JOptionPane;

public class TiposJanelasGraficas {
	public static void main(String[] args) {

		// ENTRADA DE DADOS
		String nome = JOptionPane.showInputDialog("Informe seu nome");

		// SAÍDA DE DADOS
		JOptionPane.showMessageDialog(null, nome, "SEU NOME É", JOptionPane.INFORMATION_MESSAGE);

		// ----

		// ENTRADA DE VALOR INTEIRO - conversão com Integer()
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));
		JOptionPane.showMessageDialog(null, "Você digitou o valor inteiro: " + valor1);

		double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para conversão: "));
		JOptionPane.showMessageDialog(null, "Valor convertido: " + valor2);
	}
}