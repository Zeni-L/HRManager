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
		
		String cpf = Console.lerString("Insira o CPF do funcion�rio: ");
		
		funcionario = ColaboradorController.buscarPorCpf(cpf);
		
		if(funcionario != null) {
			
			int ano = Console.lerInteiro("Ano de refer�ncia: ");
			int mes = Console.lerInteiro("M�s de refer�ncia: ");
			
			holerite = PagamentoController.buscarFuncionarioMesAno(cpf, mes, ano);
			
			if(holerite != null) {
				
				System.out.println(holerite);
				
			}else {
				System.out.println("\nHolerite n�o encontrado\n");
			}
		}else {
			System.out.println("\nFuncion�rio n�o encontrado\n");
		}
	}
}