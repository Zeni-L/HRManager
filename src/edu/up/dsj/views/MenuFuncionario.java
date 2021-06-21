package edu.up.dsj.views;

import edu.up.dsj.utils.Console;

public class MenuFuncionario {

	public static void isColaborador() {

		int escolha = 0;

		do {
			System.out.println("\n========= FUNCIONÁRIOS =========\n");

			System.out.println("1. Cadastrar novo funcionário" + "\n2. Listar todos os funcionários"
					+ "\n3. Consultar funcionários - Horistas" + "\n4. Consultar funcionários - Mensalistas"
					+ "\n5. Buscar funcionário" + "\n6. Editar Dados de funcionário" + "\n7. Deletar funcionário"
					+ "\n0. Sair");

			escolha = Console.lerInteiro("\nEscolha uma das opções acima: ");

			switch (escolha) {
			case 1:
				CadastrarFuncionario.cadastrar();
				break;
			case 2:
				ListarFuncionarios.renderizarTodos();
				break;
			case 3:
				ListarFuncionarios.renderizarHoristas();
				break;
			case 4:
				ListarFuncionarios.renderizarMensalistas();
				break;
			case 5:
				BuscarFuncionario.imprimirColaborador();
				break;
			case 6:
				EditarFuncionario.alterar();
				break;
			case 7:
				RemoverFuncionario.remover();
				break;
			case 0:
				System.out.println("Saindo...\n");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (escolha != 0);
	}
}