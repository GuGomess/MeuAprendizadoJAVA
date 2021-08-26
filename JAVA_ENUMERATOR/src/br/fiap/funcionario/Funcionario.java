package br.fiap.funcionario;
import br.fiap.cargo.Cargo_ENUMERATOR;

public class Funcionario {
	private String nome;
	private double salario;
	private Cargo_ENUMERATOR cargo;
	
	public Funcionario(String nome, double salario, Cargo_ENUMERATOR cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public String toString() {
		return "Nome: " + nome +"\nSalário: " + salario;
	}

	public Cargo_ENUMERATOR getCargo() {
		return cargo;
	}

	public void setCargo(Cargo_ENUMERATOR cargo) {
		this.cargo = cargo;
	}
	
	
}