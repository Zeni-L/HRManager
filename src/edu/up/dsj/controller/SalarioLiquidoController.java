package edu.up.dsj.controller;

/**
 * Criando página para cálculo de salário líquido ao final do mês
 * @author Julio Cezar
 */

public class SalarioLiquidoController {

    public static float calcularINSS(float salarioBruto) {
    	float inss;
        if(salarioBruto <= 1100.00f){
        	inss = salarioBruto * 0.075f;
        }else if(salarioBruto <= 2203.48f){
        	inss = salarioBruto * 0.09f;
        }else if(salarioBruto <= 3305.22f){
        	inss = salarioBruto * 0.12f;
        }else if(salarioBruto <= 6433.57f){
        	inss = salarioBruto * 0.14f;
        }else{
        	inss = salarioBruto * 0.05f;
        }
        return inss;
    }

    public static float calcularIR(float salarioBruto) {
    	float ir;
        if(salarioBruto <= 1903.98f){
            ir = salarioBruto * 0.00f;
        }else if(salarioBruto <= 2826.65f){
            ir = salarioBruto * 0.075f;
        }else if(salarioBruto <= 3751.06f){
            ir = salarioBruto * 0.15f;
        }else if(salarioBruto <= 4664.68f){
            ir = salarioBruto * 0.225f;    
        }else{
            ir = salarioBruto * 0.275f;
        }
        return ir;
    }

    public static float calcularSalarioLiquido(float salarioBruto, float ir, float inss) {
        return salarioBruto - ir - inss;
        
    }
}