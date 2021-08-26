package Exercicio02_BANCO;

import java.util.Scanner;

public class Principal {

	static Scanner entrada = new Scanner(System.in);
	static Cliente cliente;

	public static void main(String[] args) {

		int opcao;
		do {
			System.out.print(Menu() + "Escolha: ");
			opcao = entrada.nextInt();
			System.out.println();

			if (opcao < 1 || opcao > 6) {
				System.out.println("Opção inválida.\n");
			} else {
				switch (opcao) {
				case 1:
					abrirConta();
					break;
				case 2:
					consultarSaldo();
					break;
				case 3:
					consultarFatura();
					break;
				case 4:
					depositar();
					break;
				case 5:
					sacar();
					break;
				}
			}
			System.out.println();
		} while (opcao != 6);

	}

	public static String Menu() {
		String aux = "";
		aux += "Escolha uma operação\n";
		aux += "1. Abrir conta\n";
		aux += "2. Consultar Saldo\n";
		aux += "3. Consultar Fatura\n";
		aux += "4. depositar\n";
		aux += "5. sacar\n";
		aux += "6. Finalizar\n";
		return aux;
	}

	public static void abrirConta() {
		entrada.nextLine();
		String nome, cpf;
		System.out.println("/ / ABRIR CONTA / /");
		System.out.print("Informe seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Informe seu CPF: ");
		cpf = entrada.next();
		cliente = new Cliente(nome, cpf);
		System.out.println(
				"Cadastro concluído!\n" + "Bem vindo " + cliente.nome + " ;) \n" + "Portador do CPF: " + cliente.cpf);
	}

	static void consultarSaldo() {
		System.out.println("/ / CONSULTAR SALDO / /");
		if (cliente.conta.saldo <= 1) {
			System.out.println("Seu saldo é: R$" + cliente.conta.saldo + " :/");
		} else
			System.out.println("Saldo: R$" + cliente.conta.saldo + "\n");
	}

	public static void consultarFatura() {
		System.out.println("/ / CONSULTAR FATURA / /");
		System.out.println("Fatura atual: R$ " + cliente.cartao.totalFatura);
	}

	public static void depositar() {
		System.out.println("/ / DEPÓSITO / /");
		double valor = 0;
		System.out.print("Digite o valor do depósito: \n R$ ");
		valor = entrada.nextDouble();
		cliente.conta.depositar(valor);
	}

	public static void sacar() {
		System.out.println("/ / SAQUE / /");
		double valor = 0;
		System.out.print("Digite o valor do saque: \n R$ ");
		valor = entrada.nextDouble();
		cliente.conta.sacar(valor);
	}
}