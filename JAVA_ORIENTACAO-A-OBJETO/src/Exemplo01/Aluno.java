package Exemplo01;
public class Aluno {

	// VARIAVEL GLOBAL

	// STATIC: FUNCIONA QUANDO NÃO HÁ OBJETOS
	static int exemplo;

	// COM OBJETO:
	int rm;
	String nome;
	double nota1;
	double nota2;

	// Calcular média
	public double calcularMedia() {
		double media;
		media = (nota1 + nota2) / 2;
		return media;
	}

	// Verificar aprovação
	public String aprovacao() {

		if (calcularMedia() >= 7) {
			return "APROVADO";
		}
		return "REPROVADO";
	}

	//Verificar tipo de RM	
	public String tipoRM() {
		if (rm > 5000) {
			return "MAIOR QUE 5000";
		}
		return "MENOR QUE 5000";
	}

	public String geral() {

		String aux = "";

		aux += "\nRM:\t " + rm + "\n";
		aux += "Nome:\t " + nome + "\n";
		aux += "Nota 1:\t " + nota1 + "\n";
		aux += "Nota 2:\t " + nota2 + "\n";
		aux += "SITUAÇÃO:\t " + aprovacao() + "\n";
		return aux;
	}
}
