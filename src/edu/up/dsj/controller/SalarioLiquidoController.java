package edu.up.dsj.controller;
//Criando página para cálculo de salário líquido ao final do mês
//@author: Julio Cezar

import edu.up.dsj.models.Pagamento;

public class SalarioLiquidoController {

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
}
