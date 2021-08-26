package empregado;

public class EmpregadoComissionado extends Empregado {
	
	private double totalDeVendas;
	private double comissao;
	
	//CONSTRUTOR
	public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}
	
	//METODOS
	public String toString() {
		String aux = super.toString();
		aux += "\nTotal de vendas: R$ " + String.format("%.2f", totalDeVendas);
		aux += "\nComissão: R$ " + String.format("%.2f", comissao);
		return aux;
	}
	
	public double calcularSalario() {
	return totalDeVendas * comissao;
	}

	public double getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}