package edu.up.dsj.views;

import java.util.Scanner;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Setor;

/**
 * Classe usada em testes de retorno de objeto. N�o implementada na vers�o final
 * do c�digo.
 * @author Leandro Zeni
 */
public class RenderSetor {

	public static void buscarSetor() {

		Scanner sc = new Scanner(System.in);
		Setor buscaSetor = new Setor();
		Integer codigo = 0;

		System.out.print("\nInsira o c�digo: ");
		codigo = sc.nextInt();

		System.out.println(codigo);

		buscaSetor = SetorController.retornarSetor(codigo);

		System.out.println(buscaSetor);
	}
}