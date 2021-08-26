package exemplos_ARRAYLIST_EXCEÇÕES;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main2_TratamentoDeErros {

	public static void main(String[] args) {

		ArrayList<Produto> lista = new ArrayList<Produto>();
		String nome;
		double preco;

		// TRATAMENTO DE EXCEÇÕES TRY{ } CATCH() { }

		// CASO O USUÁRIO INSIRA UM VALOR INVÁLIDO

		for (int i = 0; i < 3; i++) {
			
			// DECLARAÇÃO DE BLOCO DE RISCO
			try {
				nome = JOptionPane.showInputDialog(null, "Nome do produto");
				preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço do produto"));
				lista.add(new Produto(nome, preco));
			}
			// DIFININDO POSSÍVEL ERRO E EXECUTANDO CÓDIGO

			// ERRO CASO O USUÁRIO INSIRA UMA STRING DENTRO DE DOUBLE
			catch (NumberFormatException erro1) {
				JOptionPane.showMessageDialog(null, "Você deve inserir um número no PREÇO");
				System.out.println(erro1);

				// ERRO CASO O USUÁRIO FECHE A JANELA ANTES DE INSERIR VALORES
			} catch (NullPointerException erro2) {
				JOptionPane.showMessageDialog(null, "É necessário inserir um valor antes de fechar a janela");
			}
		}
	}
}