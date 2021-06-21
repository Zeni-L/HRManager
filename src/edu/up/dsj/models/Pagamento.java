package edu.up.dsj.models;

import java.text.DecimalFormat;

public class Pagamento {

	private int mes;

	private int ano;

	private double inss;

	private double ir;

	private double fgts;

	private double valorFinal;

	private Funcionario funcionario;

	DecimalFormat formato;

	public Pagamento() {

		formato = new DecimalFormat("#.##");

	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getIr() {
		return ir;
	}

	public void setIr(double ir) {
		this.ir = ir;
	}

	public double getFgts() {
		return fgts;
	}

	public void setFgts(double fgts) {
		this.fgts = fgts;
	}

	public double getvalorFinal() {
		return valorFinal;
	}

	public void setvalorFinal(double valorLiquido) {
		this.valorFinal = valorLiquido;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioHora funcionario) {
		this.funcionario = funcionario;
	}
	
	public void setFuncionario(FuncionarioMes funcionario2) {
		this.funcionario = funcionario2;
	}

	@Override
	public String toString() {
		return "\n=============================================\n" + "\nMes de referência: " + mes + " | Ano: " + ano + "\n"
				+ "\n=============================================" + "\nDescontos: " + "\nINSS: R$ "
				+ formato.format(inss) + "\nIR: R$ " + formato.format(ir) + "\nValor a receber: R$ " + valorFinal;
	}
}