package edu.up.dsj.models;

import java.text.DecimalFormat;

public class Pagamento {

	private int mes;

	private int ano;

	private double valorHora;
	
	private int horasTrabalhadas;

	private double inss;

	private double ir;

	private double fgts;
	
	private double valorBruto;

	private double valorLiquido;

	private PessoaFisica funcionario;
	
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

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
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

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public PessoaFisica getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(PessoaFisica funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "\n=============================================\n" + "\nFuncionário: " + funcionario.getNome()
				+ "\nCPF: " + funcionario.getCpf() + "\nMes de referência: " + mes
				+ " | Ano: " + ano + "\n" + "\n=============================================\n"
				+ "\nSalario: " + valorBruto + "\n\nDescontos: " + "\nINSS: R$ " + formato.format(inss) + "\nIR: R$ " + formato.format(ir)
				+ "\nValor a receber: R$ " + valorLiquido;
	}
}