package edu.up.dsj.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class FolhaPonto {

	private Colaborador funcionario;
	private LocalDate diaDoPonto;
	private LocalTime entrada;
	private LocalTime saida;

	public FolhaPonto() {
		this.diaDoPonto = LocalDate.now();
	}

	public Colaborador getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Colaborador funcionario) {
		this.funcionario = funcionario;
	}

	public LocalDate getDiaDoPonto() {
		return diaDoPonto;
	}

	public void setDiaDoPonto(LocalDate diaDoPonto) {
		this.diaDoPonto = diaDoPonto;
	}

	public LocalTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalTime entrada) {
		this.entrada = entrada;
	}

	public LocalTime getSaida() {
		return saida;
	}

	public void setSaida(LocalTime saida) {
		this.saida = saida;
	}

	@Override
	public boolean equals(Object obj) {
		FolhaPonto outroPonto = (FolhaPonto) obj;
		return getFuncionario().equals(outroPonto.getFuncionario());
	}
}