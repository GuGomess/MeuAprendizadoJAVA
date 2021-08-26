package main;

import java.util.Scanner;

import atleta.Atleta;

public class Main_Encapsulamento {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nome = "";
		double peso;
		double altura;
		
		System.out.println("INSERIR DADOS -----");
		System.out.print("Nome:\t");
		nome = entrada.next();

		System.out.print("Peso:\t");
		peso = entrada.nextDouble();

		System.out.print("Altura:\t");
		altura = entrada.nextDouble();

		Atleta atleta = new Atleta(nome, peso, altura);

		System.out.println("\nDADOS--------------\n" + atleta.getDados());

		// ALTERAR DADOS
		System.out.println("\nALTERAR DADOS -----");
		System.out.print("Alterar nome:\t");
		nome = entrada.next();
		atleta.setNome(nome);

		System.out.print("Alterar peso:\t");
		peso = entrada.nextDouble();
		atleta.setPeso(peso);

		System.out.print("Alterar altura:\t");
		altura = entrada.nextDouble();
		atleta.setAltura(altura);

		// DADOS MODIFICADOS
		System.out.println("\nNOVOS DADOS--------\n" + atleta.getDados());

		entrada.close();
	}

}