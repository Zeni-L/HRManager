package edu.up.dsj.controller;

public class InssController {

	public static float calcularInss(float salarioBruto) {

		/**
		 * Cálculo do INSS
		 */
		if (salarioBruto < 1663.72) {

			return salarioBruto - 8 / 100;
		}

		else if (salarioBruto < 1693.73 && salarioBruto > 2822.90) {

			return salarioBruto - 9 / 100;
		}

		else if (salarioBruto < 2822.91 && salarioBruto > 5645.80) {

			return salarioBruto - 11 / 100;
		} 
		
		else {

			return salarioBruto - 621.03F;
		}
	}
}
