package edu.up.dsj.views;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.VagasController;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.utils.Console;

public class RemoverColaborador {

//	public static void remover() {
//
//		Colaborador colaborador = new Colaborador();
//		String cpf;
//		Integer codSetor;
//		int retorno;
//
//		System.out.println("====== REMOVER COLABORADORES ======");
//		cpf = Console.lerString("Insira o CPF do colaborador: ");
//
//		colaborador = ColaboradorController.buscarPorCpf(cpf);
//
//		if (colaborador != null) {
//			codSetor = colaborador.getSetor().getCodigoSetor();
//			retorno = VagasController.acharVaga(codSetor);
//			
//			if (ColaboradorController.deletar(colaborador) == true) {
//				VagasController.liberarVaga(retorno);
//				System.out.println("\nColaborador removido!\n");
//			} else
//				System.out.println("\nNão foi possível remover. Tente novamente\n");
//		} else
//			System.out.println("\nColaborador não localizado. Tente novamente\n");
//	}
}