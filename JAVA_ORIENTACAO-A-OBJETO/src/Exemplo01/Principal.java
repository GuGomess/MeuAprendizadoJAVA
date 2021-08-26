package Exemplo01;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		// objeto Scanner.
		// in = objeto padrão de entrada.
		Scanner entrada = new Scanner(System.in);

		// CRIAÇÃO DE OBJETO.

//		// FORMA 1 de criação
//		Aluno a; 			// variavel de referência.
//		a = new Aluno(); 	// aluno(); método construtor.

		// FORMA 2 de criação	<< MELHOR
		Aluno	 a2 = new Aluno();

		//entrada de dados
		System.out.print("Nome do aluno:\t ");
		a2.nome = entrada.next();
				
		System.out.print("RM:\t ");
		a2.rm = entrada.nextInt();
		
		System.out.print("Nota 1:\t ");
		a2.nota1 = entrada.nextDouble();
		
		System.out.print("Nota 2:\t ");
		a2.nota2 = entrada.nextDouble();				
		
		//impressão da média
		System.out.println("Média: " + a2.calcularMedia());
		
		System.out.println("Situação: " + a2.aprovacao());
		
		System.out.println("tipo de RM: " + a2.tipoRM());
		
		System.out.println("=  =  =  =  =  =  =  =  =  =  =  =  =  =  =");
		
		System.out.print("------ DADOS \n"+ a2.geral());
		
		entrada.close();
	}
		
}