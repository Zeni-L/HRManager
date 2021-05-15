package edu.up.dsj.views;

import java.util.Scanner;

import edu.up.dsj.controller.SalarioLiquidoController;
import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.models.Pagamento;

/**
 * Criando interface para o usuário inserir dados para o cálculo de salário
 * líquido ao final do mês
 * @author Julio Cezar
 */
public class FolhaPagamento {

	private static Colaborador colaborador;

	public static void calcularFolha() {

		Pagamento pagamento = new Pagamento();
		Scanner sc = new Scanner(System.in);
		String cpfColaborador;
		float salariobruto;

		System.out.println("\n========= FOLHA DE PAGAMENTO =========\n");
		System.out.print("Digite o CPF do funcionário: ");
		cpfColaborador = sc.nextLine();
		colaborador = ColaboradorController.buscarPorCpf(cpfColaborador);

		if (colaborador != null) {
			salariobruto = colaborador.getSalarioBruto();
			pagamento.setSalarioBruto(salariobruto);
			pagamento.setINSS(SalarioLiquidoController.calcularINSS(salariobruto));
			pagamento.setIR(SalarioLiquidoController.calcularIR(salariobruto));
			pagamento.setSalarioLiq(SalarioLiquidoController.calcularSalarioLiquido(salariobruto, pagamento.getINSS(),
					pagamento.getIR()));
			System.out.println(pagamento.toString());

		} else {
			System.out.println("Não existe um cliente com esse CPF cadastrado.");
		}
	}
}