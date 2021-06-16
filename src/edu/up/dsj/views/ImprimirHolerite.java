package edu.up.dsj.views;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.PagamentoController;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.models.Pagamento;
import edu.up.dsj.utils.Console;

public class ImprimirHolerite {

	public static void imprimirFolha() {

		Colaborador funcionario = new Colaborador();
		Pagamento holerite = new Pagamento();
		
		System.out.println("========== CONSULTA DE FOLHAS ==========\n");
		
		String cpf = Console.lerString("Insira o CPF do funcionário: ");
		
		funcionario = ColaboradorController.buscarPorCpf(cpf);
		
		if(funcionario != null) {
			
			int ano = Console.lerInteiro("Ano de referência: ");
			int mes = Console.lerInteiro("Mês de referência: ");
			
			holerite = PagamentoController.buscarFuncionarioMesAno(cpf, mes, ano);
			
			if(holerite != null) {
				
				System.out.println(holerite);
				
			}else {
				System.out.println("\nHolerite não encontrado\n");
			}
		}else {
			System.out.println("\nFuncionário não encontrado\n");
		}
	}
}