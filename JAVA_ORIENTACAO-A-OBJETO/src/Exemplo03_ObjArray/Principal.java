package Exemplo03_ObjArray;

import java.util.Scanner;

public class Principal {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Aluno[] aluno = new Aluno[2];
		String nome;
		int rm;

		// ENTRADA DE DADOS
		for (int i = 0; i < aluno.length; i++) {
			System.out.println("------------------");
			System.out.println("Nome do " + (i + 1) + "º aluno");
			System.out.print("Nome do aluno:\t");
			nome = entrada.nextLine();
			System.out.print("RM do aluno:\t");
			rm = entrada.nextInt();
			aluno[i] = new Aluno(nome, rm); // CRIANDO OBJETO NO ÍNDICE DO VETOR
			entrada.nextLine();
		}

		// SAÍDA DE DADOS
		System.out.println();
		System.out.println("------------------");
		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Nome:\t" + aluno[i].nome + "\n" + "RM:\t" + aluno[i].rm + "\n------------------");
		}

	}

}