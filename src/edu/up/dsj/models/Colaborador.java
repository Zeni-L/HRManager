package edu.up.dsj.models;

import java.util.Date;

public class Colaborador {

	private String nome;
	
	private String cpf;
	
	private int matricula;
	
	private long telefone;
	
	private String endereco;
	
	private Date cadastradoEm;
	
	private float salarioBruto;
	
	private Setor setor;
	
	public Colaborador() {
		
		this.cadastradoEm = new Date();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getCadastradoEm() {
		return cadastradoEm;
	}

	public void setCadastradoEm(Date cadastradoEm) {
		this.cadastradoEm = cadastradoEm;
	}

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Colaborador [nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", cadastradoEm=" + cadastradoEm + ", salario bruto=" + salarioBruto + ", setor="
				+ setor + "]";
	}
}