package edu.up.dsj.views;

import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Setor;
import edu.up.dsj.utils.Console;

/**
 * Classe usada em testes de retorno de objeto. N�o implementada na vers�o final
 * do c�digo.
 * @author Leandro Zeni
 */
public class RenderSetor {

	public static void buscarSetor() {

		Setor buscaSetor = new Setor();
		Integer codigo = 0;

		codigo = Console.lerInteiro("\nInsira o c�digo: ");

		System.out.println(codigo);

		buscaSetor = SetorController.retornarSetor(codigo);

		System.out.println(buscaSetor);
	}
}