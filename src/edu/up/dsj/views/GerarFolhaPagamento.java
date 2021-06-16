package edu.up.dsj.views;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.PagamentoController;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.models.Pagamento;
import edu.up.dsj.utils.Console;

/**
 * Criando interface para o usuário inserir dados para o cálculo de salário
 * líquido ao final do mês
 * 
 * @author Leandro Zeni.
 */
public class GerarFolhaPagamento {

//	public static void calcularFolha() {
//
//		Pagamento holerite = new Pagamento();
//		Colaborador funcionario = new Colaborador();
//
//		System.out.println("========== GERAR HOLERITE ==========\n");
//
//		String cpf = Console.lerString("Insira o CPF do funcionário: ");
//
//		funcionario = ColaboradorController.buscarPorCpf(cpf);
//
//		if (funcionario != null) {
//
//			holerite.setFuncionario(funcionario);
//			
//			holerite.setHorasTrabalhadas(Console.lerInteiro("Total de horas trabalhadas no mês: "));
//			holerite.setValorHora(Console.lerDouble("Valor da hora: "));
//			holerite.setAno(Console.lerInteiro("Ano de referência: "));
//			holerite.setMes(Console.lerInteiro("Mês de referência: "));
//			
//			holerite.setValorBruto(PagamentoController.calcularSalarioBruto(holerite.getHorasTrabalhadas(), holerite.getValorHora()));
//			holerite.setFgts(PagamentoController.calcularFGTS(holerite.getValorBruto()));
//			holerite.setInss(PagamentoController.calcularINSS(holerite.getValorBruto()));
//			holerite.setIr(PagamentoController.calcularINSS(holerite.getValorBruto()));
//			holerite.setValorLiquido(PagamentoController.calcularSalarioLiquido(holerite.getValorBruto(),
//					holerite.getIr(), holerite.getInss()));
//
//			if (PagamentoController.gerarHolerite(holerite) == true) {
//				System.out.println("\nFolha de pagamento cadastrada!\n");
//				
//			} else {
//				System.out.println("\nNão foi possível cadastrar. Tente novamente\n");
//			}
//		} else {
//			System.out.println("\nFuncionário não cadastrado\n");
//		}
//	}
}