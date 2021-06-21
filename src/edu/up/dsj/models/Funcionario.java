package edu.up.dsj.models;

import java.util.Date;

public class Funcionario {

	private String nome;
	
	private String cpf;

	private String telefone;

	private String endereco;

	private Date cadastradoEm;

	private Setor setor;
	
	public Funcionario() {

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
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

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", cadastradoEm=" + cadastradoEm + ", setor=" + setor + "]";
	}
}