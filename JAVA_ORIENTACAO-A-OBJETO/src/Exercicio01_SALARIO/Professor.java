package Exercicio01_SALARIO;

public class Professor {

	// ATRIBUTOS DO OBJETO
	String nome;
	String titulacao;
	double valorHoraAula;
	int totalDeAulas;

	//MÉTODO PARA CALCULAR O RETORNAR O VALOR DO SALÁRIO MENSAL DO PROFESSOR
	public double calcularSalario() {
		double sb, ha, dsr;

		// SALÁRIO BASE
		sb = valorHoraAula * 4.5 * totalDeAulas;
		if (titulacao.equalsIgnoreCase("mestre")) {
			sb *= 1.03; // AUMENTO DE 3%
		} else if (titulacao.equalsIgnoreCase("doutor")) {
			sb *= 1.085; // AUMENTO DE 8,5%
		}

		// ADICIONAL DE HORA ATIVIDADE
		ha = sb * 0.05;
		// DENSANSO SEMANAL REMUNERADO
		dsr = (sb + ha) / 6;

		return (sb + ha + dsr);
	}

	// MÉTODO PARA AJUSTAR O VALOR DA HORA AULA DO PROFESSOR
	public void ajustarValorHoraAula(double porcentagem) {

		valorHoraAula = valorHoraAula + (1 + porcentagem / 100);

	}

	public String retornarDados() {
		String aux = "";

		aux += "Nome do professor: " + nome + "\n";
		aux += "Titulo: \t" + titulacao + "\n";
		aux += "Salário R$ " + String.format("%.2f", calcularSalario()); // formatação das casas decimais

		return aux;
	}

}
