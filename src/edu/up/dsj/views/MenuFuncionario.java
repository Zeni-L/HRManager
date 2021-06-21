package edu.up.dsj.views;

import edu.up.dsj.utils.Console;

public class MenuFuncionario {

	public static void isColaborador() {

		int escolha = 0;

		do {
			System.out.println("\n========= FUNCION�RIOS =========\n");

			System.out.println("1. Cadastrar novo funcion�rio" + "\n2. Listar todos os funcion�rios"
					+ "\n3. Consultar funcion�rios - Horistas" + "\n4. Consultar funcion�rios - Mensalistas"
					+ "\n5. Buscar funcion�rio" + "\n6. Editar Dados de funcion�rio" + "\n7. Deletar funcion�rio"
					+ "\n0. Sair");

			escolha = Console.lerInteiro("\nEscolha uma das op��es acima: ");

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
				System.out.println("\nOp��o inv�lida!");
				break;
			}
		} while (escolha != 0);
	}
}