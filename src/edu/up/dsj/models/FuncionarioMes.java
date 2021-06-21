package edu.up.dsj.models;

public class FuncionarioMes extends Funcionario {

	private double salarioBruto;

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	@Override
	public String toString() {
		return "FuncionarioMes [salarioBruto=" + salarioBruto + "]";
	}
}