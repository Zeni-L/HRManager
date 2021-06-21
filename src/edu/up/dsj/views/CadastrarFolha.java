package edu.up.dsj.views;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.controller.PagamentoController;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.models.FuncionarioHora;
import edu.up.dsj.models.FuncionarioMes;
import edu.up.dsj.models.Pagamento;
import edu.up.dsj.utils.Console;

/**
 * Criando interface para o usu�rio inserir dados para o c�lculo de sal�rio
 * l�quido ao final do m�s
 * 
 * @author Leandro Zeni.
 */
public class CadastrarFolha {

	public static void calcularFolha() {

		Pagamento holerite = new Pagamento();
		Funcionario funcionario = new Funcionario();

		System.out.println("========== GERAR HOLERITE ==========\n");

		String cpf = Console.lerString("Insira o CPF do funcion�rio: ");

		funcionario = FuncionarioController.buscarPorCpf(cpf);

		if (funcionario != null) {
			if (funcionario instanceof FuncionarioHora) {

				holerite.setFuncionario((FuncionarioHora) funcionario);

				holerite.setAno(Console.lerInteiro("Ano de refer�ncia: "));
				holerite.setMes(Console.lerInteiro("M�s de refer�ncia: "));

				((FuncionarioHora) funcionario)
						.setHorasTrabalhadas(Console.lerDouble("Total de horas trabalhadas no referido m�s: "));

				double brutoHora = PagamentoController.calcularSalarioBruto(
						((FuncionarioHora) funcionario).getHorasTrabalhadas(),
						((FuncionarioHora) funcionario).getValorHora());

				holerite.setFgts(PagamentoController.calcularFGTS(brutoHora));
				holerite.setInss(PagamentoController.calcularINSS(brutoHora));
				holerite.setIr(PagamentoController.calcularINSS(brutoHora));
				holerite.setvalorFinal(
						PagamentoController.calcularSalarioLiquido(brutoHora, holerite.getIr(), holerite.getInss()));

				if (PagamentoController.gerarHolerite(holerite) == true) {
					System.out.println("\nFolha de pagamento cadastrada!\n");

				} else {
					System.out.println("\nN�o foi poss�vel cadastrar. Tente novamente\n");
				}
			} else {
				holerite.setFuncionario((FuncionarioMes) funcionario);

				holerite.setAno(Console.lerInteiro("Ano de refer�ncia: "));
				holerite.setMes(Console.lerInteiro("M�s de refer�ncia: "));

				holerite.setFgts(PagamentoController.calcularFGTS(((FuncionarioMes) funcionario).getSalarioBruto()));
				holerite.setInss(PagamentoController.calcularINSS(((FuncionarioMes) funcionario).getSalarioBruto()));
				holerite.setIr(PagamentoController.calcularINSS(((FuncionarioMes) funcionario).getSalarioBruto()));
				holerite.setvalorFinal(PagamentoController.calcularSalarioLiquido(
						((FuncionarioMes) funcionario).getSalarioBruto(), holerite.getIr(), holerite.getInss()));

				if (PagamentoController.gerarHolerite(holerite) == true) {
					System.out.println("\nFolha de pagamento cadastrada!\n");
				} else {
					System.out.println("\nN�o foi poss�vel cadastrar. Tente novamente\n");
				}
			}

		} else {
			System.out.println("\nFuncion�rio n�o cadastrado\n");
		}
	}
}