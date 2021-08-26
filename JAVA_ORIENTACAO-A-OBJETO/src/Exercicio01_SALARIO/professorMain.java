package Exercicio01_SALARIO;

import java.util.Scanner;

public class professorMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// DECLARAÇÃO DE OBJETO
		Professor p = new Professor();

		// ENTRADA
		System.out.print("Nome do professor: ");
		p.nome = entrada.next();

		System.out.println("Titulação (MESTRE/DOUTOR): ");
		System.out.print("Digite: ");
		p.titulacao = entrada.next();

		System.out.print("Valor da hora: ");
		p.valorHoraAula = entrada.nextDouble();

		System.out.print("Total de aulas: ");
		p.totalDeAulas = entrada.nextInt();

		// SAÍDA
		System.out.println();
		System.out.println("====================");
		System.out.print(p.retornarDados());

		entrada.close();
	}
}