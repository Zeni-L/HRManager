package edu.up.dsj.controller;

public class IrController {

	public static float calcularIr(float salarioBruto) {

		if (salarioBruto < 1903.98) {

			return salarioBruto;
		}

		/**
		 * Calculo de IR. Aliquota a 7.5% e valor a ser deduzido de R$ 142,80.
		 */
		else if (salarioBruto > 1903.99 && salarioBruto < 2826.65) {
			float percentual = salarioBruto - 7.5F / 100F;
			float valorDeduzido = 142.80F;

			return percentual - valorDeduzido;
		}

		/**
		 * Calculo de IR. Aliquota a 15% e valor a ser deduzido de R$ 354,80.
		 */
		else if (salarioBruto > 2826.66 && salarioBruto < 3751.05) {
			float percentual = salarioBruto - 15F / 100F;
			float valorDeduzido = 354.80F;

			return percentual - valorDeduzido;
		}

		/**
		 * Calculo de IR. Aliquota a 22.5% e valor a ser deduzido de R$ 636,13.
		 */
		else if (salarioBruto > 3751.06 && salarioBruto < 4664.68) {
			float percentual = salarioBruto - 22.5F / 100F;
			float valorDeduzido = 636.13F;

			return percentual - valorDeduzido;
		}

		/**
		 * Calculo de IR. Aliquota a 27.5% e valor a ser deduzido de R$ 869.36.
		 */
		else {
			float percentual = salarioBruto - 27.5F / 100F;
			float valorDeduzido = 869.36F;

			return percentual - valorDeduzido;
		}
	}
}