package Exercicio03_LOCACAO;

public class Bicicleta {
	//ATRIBUTOS
	String cor;
	int numMarchas;
	double valor;

	//M�TODOS
	public String dados() {
		String aux = "";
		aux += "COR: " + cor + "\n";
		aux += "QTD MARCHAS: " + numMarchas + "\n";
		aux += "VALOR: " + valor + "\n";
		return aux;
	}
}