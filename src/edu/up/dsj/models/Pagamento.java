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
    
    public void calcularINSS() {
        if(this.salarioBruto <= 1100.00f){
            this.INSS = this.salarioBruto * 0.075f;
        }else if(this.salarioBruto <= 2203.48f){
            this.INSS = this.salarioBruto * 0.09f;
        }else if(this.salarioBruto <= 3305.22f){
            this.INSS = this.salarioBruto * 0.12f;
        }else if(this.salarioBruto <= 6433.57f){
            this.INSS = this.salarioBruto * 0.14f;
        }else{
            this.INSS = this.salarioBruto * 0.05f;
        }
    }

    public void calcularIR() {
        if(this.salarioBruto <= 1903.98f){
            this.IR = this.salarioBruto * 0.00f;
        }else if(this.salarioBruto <= 2826.65f){
            this.IR = this.salarioBruto * 0.075f;
        }else if(this.salarioBruto <= 3751.06f){
            this.IR = this.salarioBruto * 0.15f;
        }else if(this.salarioBruto <= 4664.68f){
            this.IR = this.salarioBruto * 0.225f;    
        }else{
            this.IR = this.salarioBruto * 0.275f;
        }
    }

    public void calcularSalarioLiquido() {
        this.SalarioLiq = this.salarioBruto - this.IR - this.INSS;
    }
    
	@Override
	public String toString() {
		return "Folha de pagamento:\n\nSalário bruto:" + salarioBruto + "\n\nDescontos:\nIR:" + IR + "\nINSS:" + INSS +
				"\n\nSalário Líquido:" + SalarioLiq + "\n";
	}

}
