package edu.up.dsj.views;

import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Setor;

/**
 * Classe que imprime na tela para o usuário a lista de setores existentes.
 * 
 * @author Leandro Zeni
 */
public class ListarSetores {

	public static void renderizar() {

		if (!SetorController.retornarListaSetores().isEmpty()) {

			System.out.println("\n========= SETORES =========\n");
			for (Setor setor : SetorController.retornarListaSetores()) {
				System.out.println(setor.getCodigoSetor() + "." + " " + setor.getNome());
			}
			System.out.println("\n===========================");
		} else {
			System.out.println("\nNão há setores cadastrados. Cadastre um setor e tente novamente.");
		}
	}
}