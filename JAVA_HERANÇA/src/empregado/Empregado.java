package empregado;
//ABSTRACT: A CLASSE NÃ PODERÁ GERAR OBJETO.

//FINAL: INDICA QUE UMA CLASSE NUNCA PODERÁ SER UMA SUPER CLASSE.

public abstract class Empregado {
	protected long matricula;
	protected String nome;

	// CONSTRUCTOR
	public Empregado(long matricula, String nome) { // extends Object
		super(); // SUPER CLASSE: POSSIBILITA QUE OUTRAS CLASSES FILHAS UTILIZEM SEUS ATRIBUTOS.
		this.matricula = matricula;
		this.nome = nome;
	}

	// MÉTODO toString PARA RETORNAR OS DADOS DO OBJETO.
	public String toString() {
		return "Nome: " + nome + "\nMatrícula: " + matricula;

	}

	public long getMatricula() {
		return matricula;
	}

	//MÉTODO CALCULAR SALÁRIO
	// MÉTODO ABSTRATO - APONTADOR PARA A CLASSE MÃE SABER DA EXISTÊNCIA DESTE MÉTODO NAS CLASSES FILHAS
	public abstract double calcularSalario();

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

// SUPER CLASSE: POSSIBILITA QUE OUTRAS CLASSES FILHAS UTILIZEM SEUS ATRIBUTOS.