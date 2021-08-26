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
		
		//SA�DA
		System.out.println();
		System.out.println("Frequ�ncia m�xima: " + p.frequenciaMaxima());
		double[] alvo = p.frequenciaAlvo();
		System.out.println("Frequ�ncia alvo m�nima: "+alvo[0]);
		System.out.println("Frequ�ncia alvo m�xima: "+alvo[1]);
	
		entrada.close();
 	}
	
}
