package empregado;
public final class EmpregadoHorista extends Empregado {
	
	private int totalDeHorasTrabalhadas;
	private double valorHoraTrabalhada;
	
	
	//CONSTRUTOR
	public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorHoraTrabalhada) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}
	
	//MÉTODOS
	public String toString() {
		String aux = super.toString();
		aux += "\nTotal de horas trabalhadas: R$ "+totalDeHorasTrabalhadas;
		aux += "\nValor da hora trabalhada: R$ " +String.format("%.2f", valorHoraTrabalhada);
		return aux;
	}
	
	
	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorHoraTrabalhada;
	}



	
	
	
	
	
}