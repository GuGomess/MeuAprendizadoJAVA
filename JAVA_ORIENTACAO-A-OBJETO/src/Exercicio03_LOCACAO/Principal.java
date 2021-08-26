package Exercicio03_LOCACAO;

import java.util.Scanner;

public class Principal {
	static Scanner entrada = new Scanner(System.in);
	static Livro liv1 = new Livro();
	static Livro liv2 = new Livro();
	static Autor aut = new Autor();

	public static void main(String[] args) {
		escolha();

	}

	public static void escolha() {
		int escolha = 0;
		do {
			System.out.print("ESCOLHA UM CADASTRO\n" + "1. BICICLETA\n" + "2. AUTOR\n" + "3. LIVRO\n" + "ESCOLHA: ");
			escolha = entrada.nextInt();
			if (escolha < 1 || escolha > 3) {
				System.out.println("OPÇÃO INVÁLIDA!");
			} else {
				switch (escolha) {
				case 1:
					bicicleta();
					break;
				case 2:
					autor(aut);
					break;
				case 3:
					livro(liv1, liv2, aut);
				}
			}
		} while (escolha != 2);
	}

	public static void bicicleta() {
		System.out.print("Digite a cor da bicicleta: ");
		entrada.nextLine();
		Bicicleta b = new Bicicleta();
		b.cor = entrada.nextLine();

		System.out.print("Informe o número de marchas: ");
		b.numMarchas = entrada.nextInt();

		System.out.print("Digite o preço R$ ");
		b.valor = entrada.nextDouble();

		System.out.println("----CADASTRO CONCLUÍDO---\n" + b.dados());
	}

	public static void autor(Autor aut) {
		entrada.nextLine();

		System.out.print("NOME DO AUTOR: ");
		aut.nome = entrada.next();

		System.out.print("CIDADE NATAL: ");
		aut.cidade = entrada.next();

		System.out.print("IDADE DO AUTOR: ");
		aut.idade = entrada.nextInt();

		System.out.print("QUANTIDADE DE LIVROS: ");
		aut.qtdLivros = entrada.nextInt();

		System.out.println("--CADASTRO CONCLUÍDO---\n" + aut.dados());
		escolha();
	}

	public static void livro(Livro liv1, Livro liv2, Autor aut) {
		entrada.nextLine();

		System.out.print("Titulo do Livro: ");
		liv1.titulo = entrada.next();

		System.out.print("Gênero: ");
		liv1.genero = entrada.next();

		System.out.println("--CADASTRO CONCLUÍDO---\n" + liv1.dados());
		escolha();

	}

}
