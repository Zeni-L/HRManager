package edu.up.dsj.views;

import edu.up.dsj.utils.Console;

public class MenuSetores {

	public static void isSetor() {

		int escolha;

		do {
			System.out.println("\n============ SETORES ============\n");
			System.out.println(
					"1. Cadastrar novo setor" + "\n2. Listar todos os setores" + "\n3. Editar Setor" + "\n4. Deletar Setor" + "\n0. Sair");

			escolha = Console.lerInteiro("\nEntre com a opção desejada: ");
			
			switch (escolha) {
			case 1:
				CadastrarSetor.cadastrar();
				break;
			case 2:
				ListarSetores.renderizar();
				break;
			case 3:
				EditarSetor.alterar();
				break;
			case 4:
				DeletarSetor.Deletar();
			case 0:
				System.out.println("Saindo...\n");
				break;
			default:
				System.out.println("Op��o inv�lida\n");
				break;
			}
		} while (escolha != 0);
	}
}