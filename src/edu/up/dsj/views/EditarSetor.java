package edu.up.dsj.views;

import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Setor;
import edu.up.dsj.utils.Console;

public class EditarSetor {

	public static void alterar() {

		Setor setor = new Setor();
		Integer codSetor;

		if (!SetorController.retornarListaSetores().isEmpty()) {
			System.out.println("\n========= ALTERAR INFORMAÇÕES =========\n");
			ListarSetores.renderizar();
			codSetor = Console.lerInteiro("Código do setor: ");
			setor = SetorController.retornarSetor(codSetor);
			if (!setor.equals(null)) {

				int escolha;
				System.out.println("\n1. Nome\n0. Sair");
				escolha = Console.lerInteiro("\nQual das informações deseja alterar? ");

				switch (escolha) {

				case 1:
					setor.setNome(Console.lerString("Alterar nome: "));
					System.out.println("\nDado atualizado!");
					break;
				case 0:
					System.out.println("Saindo...");
				default:
					System.out.println("\nOpção inválida. Tente novamente\n");
				}
			} 
		}else {
			System.out.println("\nNão há setores cadastrados!");
		}
	}	
}