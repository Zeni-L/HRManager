package edu.up.dsj.models;

import java.util.ArrayList;

public class Setor {

	private String nome;
	
	private Integer codigoSetor;
	
	private ArrayList<Funcionario> colaboradores;
	
	public Setor() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public ArrayList<Funcionario> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(ArrayList<Funcionario> colaboradores) {
		this.colaboradores = colaboradores;
	}

	@Override
	public String toString() {
		return "\nSetor: " + nome + " | Codigo: " + codigoSetor;
	}
}