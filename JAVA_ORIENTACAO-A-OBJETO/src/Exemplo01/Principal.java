package Exemplo01;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		// objeto Scanner.
		// in = objeto padr�o de entrada.
		Scanner entrada = new Scanner(System.in);

		// CRIA��O DE OBJETO.

//		// FORMA 1 de cria��o
//		Aluno a; 			// variavel de refer�ncia.
//		a = new Aluno(); 	// aluno(); m�todo construtor.

		// FORMA 2 de cria��o	<< MELHOR
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
		
		//impress�o da m�dia
		System.out.println("M�dia: " + a2.calcularMedia());
		
		System.out.println("Situa��o: " + a2.aprovacao());
		
		System.out.println("tipo de RM: " + a2.tipoRM());
		
		System.out.println("=  =  =  =  =  =  =  =  =  =  =  =  =  =  =");
		
		System.out.print("------ DADOS \n"+ a2.geral());
		
		entrada.close();
	}
		
}