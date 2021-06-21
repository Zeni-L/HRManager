package edu.up.dsj.views;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.controller.PagamentoController;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.models.FuncionarioHora;
import edu.up.dsj.models.FuncionarioMes;
import edu.up.dsj.models.Pagamento;
import edu.up.dsj.utils.Console;

public class ImprimirFolha {

	public static void gerarFolha() {

		Funcionario funcionario = new Funcionario();
		Pagamento holerite = new Pagamento();

		System.out.println("========== CONSULTA DE FOLHAS ==========\n");

		String cpf = Console.lerString("Insira o CPF do funcionário: ");

		funcionario = FuncionarioController.buscarPorCpf(cpf);

		if (funcionario != null) {
			if (funcionario instanceof FuncionarioHora) {

				int ano = Console.lerInteiro("Ano de referência: ");
				int mes = Console.lerInteiro("Mês de referência: ");

				holerite = PagamentoController.buscarFuncionarioMesAno(cpf, mes, ano);

				if (holerite != null) {

					System.out.println("\nNome: " + holerite.getFuncionario().getNome() + "\nCPF: "
							+ holerite.getFuncionario().getCpf() + "\nModalidade Contrato: Horista");
					System.out.println("\n=========================\n");
					System.out.println("\nValor bruto: " + ((FuncionarioHora) funcionario).getHorasTrabalhadas()
							* ((FuncionarioHora) funcionario).getValorHora());
					System.out.println(holerite);

				} else {
					
					System.out.println("\nHolerite não encontrado\n");
				}
			} else {

				int ano = Console.lerInteiro("Ano de referência: ");
				int mes = Console.lerInteiro("Mês de referência: ");

				holerite = PagamentoController.buscarFuncionarioMesAno(cpf, mes, ano);

				if (holerite != null) {

					System.out.println("\nNome: " + holerite.getFuncionario().getNome() + "\nCPF: "
							+ holerite.getFuncionario().getCpf() + "\nModalidade Contrato: Mensalista");
					System.out.println("\n=========================\n");
					System.out.println("\nValor bruto: " + ((FuncionarioMes) funcionario).getSalarioBruto());
					
					System.out.println(holerite);

				} else {
					System.out.println("\nHolerite não encontrado\n");
				}
			}

		} else {
			System.out.println("\nFuncionário não encontrado\n");
		}
	}
}