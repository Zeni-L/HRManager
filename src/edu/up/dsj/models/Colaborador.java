package edu.up.dsj.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Colaborador {

	private String nome;
	
	private String cpf;
	
	private int matricula;
	
	private int telefone;
	
	private Date cadastradoEm;
	
	private Salario salario;
	
	private Setor setor;
	
	public Colaborador() {
		
		this.cadastradoEm = new Date(System.currentTimeMillis());
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Date getCadastradoEm() {
		return cadastradoEm;
	}

	public void setCadastradoEm(Date cadastradoEm) {
		this.cadastradoEm = cadastradoEm;
	}

	public Salario getSalario() {
		return salario;
	}

	public void setSalario(Salario salario) {
		this.salario = salario;
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
				+ ", cadastradoEm=" + cadastradoEm + ", salario=" + salario + ", setor=" + setor + "]";
	}

	
}