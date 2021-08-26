package main;

import empregado.Empregado;
import empregado.EmpregadoComissionado;
import empregado.EmpregadoHorista;

public class Main {

	public static void main(String[] args) {

		Empregado[] empregados = new Empregado[4];

		empregados[0] = new EmpregadoComissionado(1000, "Nome1", 41, 120);
		empregados[1] = new EmpregadoHorista(2000, "Nome2", 42, 120);
		empregados[2] = new EmpregadoComissionado(3000, "Nome3", 160, 140);
		empregados[3] = new EmpregadoHorista(4000, "Nome4", 180, 70);

		for (int i = 0; i < empregados.length; i++) {
			System.out.println(empregados[i] + String.format("%.2f", empregados[i].calcularSalario()) + "\n-------------------------------");
		
		}
		

	}

}
