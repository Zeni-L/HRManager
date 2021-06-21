package edu.up.dsj.models;

public class FuncionarioHora extends Funcionario {

	private double horasTrabalhadas;
	
	private double valorHora;

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return "FuncionarioHora [horasTrabalhadas=" + horasTrabalhadas + ", valorHora=" + valorHora + "]";
	}
}