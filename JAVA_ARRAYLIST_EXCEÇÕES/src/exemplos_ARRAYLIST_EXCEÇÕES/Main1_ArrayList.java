package exemplos_ARRAYLIST_EXCEÇÕES;

import java.util.ArrayList;

//1. IMPORT

public class Main1_ArrayList {

	public static void main(String[] args) {
		// ARRAYLIST

		// 1. SINTAXE
		// Criando "lista" que armazena objeto da classe Produto
		ArrayList<Produto> lista = new ArrayList<Produto>();

		// 2. CRIANDO OBJETO DENTRO DO ARRAYLIST

		lista.add(new Produto("Feijão", 15.50));
		lista.add(new Produto("Batata", 5.00));

		// 3. ADQUIRINDO TAMANHO DO INDICE

		// MÉTODO .SIZE
		System.out.println(lista.get(0));
		Produto aux;
		for (int i = 0; i < lista.size(); i++) {

			aux = lista.get(i);
			System.out.println(aux);
			System.out.println(i);

		}
	}
}