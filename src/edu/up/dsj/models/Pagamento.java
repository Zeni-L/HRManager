package edu.up.dsj.models;
//Criando get's and set's para salÃ¡rio
//interface na views FolhaPagamento.java
//@author: Julio Cezar


public class Pagamento {
    
    private float valorH;

    private float horaTrab;

    private float SalarioLiq;
    
    private float salarioBruto;
    
    private float IR;
     
    private float INSS;

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
        return IR;
    }

    public void setIR(float IR) {
        this.IR = IR;
    }
    
    public float getINSS() {
        return INSS;
    }

    public void setINSS(float INSS) {
        this.INSS = INSS;
    }
    
	public void calcularSalarioBruto() {
        this.salarioBruto = this.valorH * this.horaTrab;
    }
    
	@Override
	public String toString() {
		return "Folha de pagamento:\n\nSalário bruto:" + salarioBruto + "\n\nDescontos:\nIR:" + IR + "\nINSS:" + INSS +
				"\n\nSalário Líquido:" + SalarioLiq + "\n";
	}

}
