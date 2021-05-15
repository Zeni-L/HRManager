package edu.up.dsj.models;

public class Pagamento {

	private float valorH;

	private float horaTrab;

	private float SalarioLiq;

	private float salarioBruto;

	private float ir;

	private float inss;

	public float getValorH() {
		return valorH;
	}

	public void setValorH(float valorH) {
		this.valorH = valorH;
	}

	public float getHoraTrab() {
		return horaTrab;
	}

	public void setHoraTrab(float horaTrab) {
		this.horaTrab = horaTrab;
	}

	public float getSalarioLiq() {
		return SalarioLiq;
	}

	public void setSalarioLiq(float salarioLiq) {
		SalarioLiq = salarioLiq;
	}

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public float getIR() {
		return ir;
	}

	public void setIR(float ir) {
		this.ir = ir;
	}

	public float getINSS() {
		return inss;
	}

	public void setINSS(float inss) {
		this.inss = inss;
	}

	public void calcularSalarioBruto() {
		this.salarioBruto = this.valorH * this.horaTrab;
	}

	@Override
	public String toString() {
		return "Folha de pagamento:\n\nSalário bruto:" + salarioBruto + "\n\nDescontos:\nIR:" + ir + "\nINSS:" + inss
				+ "\n\nSalário Líquido:" + SalarioLiq + "\n";
	}

}
