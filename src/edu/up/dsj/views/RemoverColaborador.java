package edu.up.dsj.views;

import java.util.Scanner;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.VagasController;
import edu.up.dsj.models.Colaborador;

public class RemoverColaborador {

	public static void remover() {

		Scanner sc = new Scanner(System.in);
		Colaborador colaborador = new Colaborador();
		String cpf;
		Integer codSetor;
		int retorno;

		System.out.println("====== REMOVER COLABORADORES ======");
		System.out.print("Insira o CPF do colaborador: ");
		cpf = sc.nextLine();

		colaborador = ColaboradorController.buscarPorCpf(cpf);

		if (colaborador != null) {
			codSetor = colaborador.getSetor().getCodigoSetor();
			;
			retorno = VagasController.acharVaga(codSetor);
			if (ColaboradorController.deletar(colaborador) == true) {
				VagasController.liberarVaga(retorno);
				System.out.println("\nColaborador removido!\n");
			} else
				System.out.println("\nNão foi possível remover. Tente novamente\n");
		} else
			System.out.println("\nColaborador não localizado. Tente novamente\n");
	}
}