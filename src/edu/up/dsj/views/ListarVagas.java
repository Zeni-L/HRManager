package edu.up.dsj.views;

import edu.up.dsj.controller.SetorController;
import edu.up.dsj.controller.VagasController;
import edu.up.dsj.models.Vaga;
import edu.up.dsj.utils.Console;

/**
 * Classe para visualização da lista de vagas de um setor pelo usuario.
 * 
 * @author Cesar Augusto
 */
public class ListarVagas {

	private static Vaga vagas = new Vaga();
	private static Integer codigoSetor;
	private static int retorno;

	public static void renderizar() {

		if (!SetorController.retornarListaSetores().isEmpty()) {
			System.out.println("\n========= VAGAS =========\n");
			codigoSetor = Console.lerInteiro("Digite o código do setor: ");
			retorno = VagasController.acharVaga(codigoSetor);
			switch (retorno) {
			case -1:
				System.out.println("\nSetor não encontrado!\n");
				break;
			default:
				vagas = VagasController.retornaVaga(retorno);
				System.out.println("\nNome do setor: " + vagas.getSetor().getNome() + "\nCódigo do setor: "
						+ vagas.getSetor().getCodigoSetor() + "\nTotal de vagas: " + vagas.getTotalDeVagas()
						+ "\nVagas preenchidas: " + vagas.getVagasPreenchidas());
				break;
			}
			System.out.println("=========================");
		} else {
			System.out.println("\nNão há setores cadastrados. Para cadastrar novas vagas, cadastre um novo setor.");
		}
	}
}