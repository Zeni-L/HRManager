package edu.up.dsj.models;
//Criando get's and set's para salário
//interface na views FolhaPagamento.java
//@author: Julio Cezar


public class Pagamento {
    
    private float valorH;

    private float horaTrab;

    private float SalarioLiq;
    
    private float salarioBruto;

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

}

