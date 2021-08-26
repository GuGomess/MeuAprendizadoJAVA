package atleta;

public class Atleta {
	private String nome;
	private double peso;
	private double altura;

	public Atleta(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public double calcularIMC() {
		return peso / (altura * altura);
	}

	public String getDados() {
		return "Nome:\t" + nome + "\nPeso:\t" + peso + "\nAltura:\t" + altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}