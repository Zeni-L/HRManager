package edu.up.dsj.views;

import edu.up.dsj.utils.Console;

public class MenuColaborador {

	public static void isColaborador() {

		int escolha = 0;

		do {
			System.out.println("\n========= COLABORADORES =========\n");

			System.out.println("1. Cadastrar novo colaborador" + "\n2. Listar todos os colaboradores"
					+ "\n3. Consultar colaboradores" + "\n4. Editar informações de colaborador"
					+ "\n5. Deletar colaborador" + "\n0. Sair");

			escolha = Console.lerInteiro("\nEscolha uma das opções acima: ");

			switch (escolha) {
			case 1:
				CadastrarColaborador.cadastrar();
				break;
			case 2:
//				ListarColaboradores.renderizar();
				break;
			case 3:
				BuscarColaborador.imprimirColaborador();
				break;
			case 4:
				EditarColaborador.alterar();
				break;
			case 5:
//				RemoverColaborador.remover();
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