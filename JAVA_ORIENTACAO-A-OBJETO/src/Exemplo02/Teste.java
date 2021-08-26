package Exemplo02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		
		//ENTRADA
		System.out.print("Nome: ");
		nome = entrada.nextLine(); //NEXTLINE: LER TODOS OS CARACTERES
		System.out.print("idade: ");
		idade = entrada.nextInt();
		
		//CHAMANDO OBJETO COM CONSTRUCTOR 
		Paciente p = new Paciente(nome, idade);
		
		//SAÍDA
		System.out.println();
		System.out.println("Frequência máxima: " + p.frequenciaMaxima());
		double[] alvo = p.frequenciaAlvo();
		System.out.println("Frequência alvo mínima: "+alvo[0]);
		System.out.println("Frequência alvo máxima: "+alvo[1]);
	
		entrada.close();
 	}
	
}
