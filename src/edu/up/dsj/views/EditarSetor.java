package edu.up.dsj.views;

import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Setor;
import edu.up.dsj.utils.Console;

public class EditarSetor {

	public static void alterar() {

		Setor setor = new Setor();
		Integer codSetor;

		if (!SetorController.retornarListaSetores().isEmpty()) {
			System.out.println("\n========= ALTERAR INFORMA��ES =========\n");
			ListarSetores.renderizar();
			codSetor = Console.lerInteiro("C�digo do setor: ");
			setor = SetorController.retornarSetor(codSetor);
			if (!setor.equals(null)) {

				int escolha;
				System.out.println("\n1. Nome\n0. Sair");
				escolha = Console.lerInteiro("\nQual das informa��es deseja alterar? ");

				switch (escolha) {

				case 1:
					setor.setNome(Console.lerString("Alterar nome: "));
					System.out.println("\nDado atualizado!");
					break;
				case 0:
					System.out.println("Saindo...");
				default:
					System.out.println("\nOp��o inv�lida. Tente novamente\n");
				}
			} 
		}else {
			System.out.println("\nN�o h� setores cadastrados!");
		}
	}	
}