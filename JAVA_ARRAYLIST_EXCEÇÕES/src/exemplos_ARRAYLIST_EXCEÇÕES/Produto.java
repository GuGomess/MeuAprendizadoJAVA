package exemplos_ARRAYLIST_EXCEÇÕES;

public class Produto {
	private String nome;
	private double preco;

//CONSTRUCTOR
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

//ToSTRING
	public String toString() {
		return "\nNome\t" + nome + "\nPreço\t" + preco;
	}

//GETTERS e SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
