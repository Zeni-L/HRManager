package edu.up.dsj.views;

import java.util.Scanner;
import edu.up.dsj.controller.VagasController;
import edu.up.dsj.models.Vaga;

/**
 * Classe para visualiza��o da lista de vagas de um setor pelo usuario.
 * @author Cesar Augusto
 */
public class ListarVagas {

	private static Scanner sc = new Scanner(System.in);
	private static Vaga vagas = new Vaga();
	private static Integer codigoSetor;
	private static int retorno;

	public static void renderizar() {

		System.out.println("========= VAGAS =========");
		System.out.println("Digite o c�digo do setor: ");
		codigoSetor = sc.nextInt();
		retorno = VagasController.acharVaga(codigoSetor);

		switch (retorno) {
		case -1:
			System.out.println("Setor n�o encontrado!");
			break;
		default:
			vagas = VagasController.retornaVaga(retorno);
			System.out.println("\nNome do setor: " + vagas.getSetor().getNome() + "\nC�digo do setor: "
					+ vagas.getSetor().getCodigoSetor() + "\nTotal de vagas: " + vagas.getTotalDeVagas()
					+ "\nVagas preenchidas: " + vagas.getVagasPreenchidas());
			break;
		}

		System.out.println("=========================");
	}
}