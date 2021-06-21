package edu.up.dsj.views;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.utils.Console;

public class RemoverFuncionario {

	public static void remover() {

		Funcionario colaborador = new Funcionario();
		String cpf;

		System.out.println("\n====== REMOVER COLABORADORES ======\n");
		cpf = Console.lerString("Insira o CPF do colaborador: ");

		colaborador = FuncionarioController.buscarPorCpf(cpf);

		if (colaborador != null) {
			if (FuncionarioController.deletar(colaborador) == true) {
				System.out.println("\nColaborador removido!\n");
			} else
				System.out.println("\nNão foi possível remover. Tente novamente\n");
		} else
			System.out.println("\nColaborador não localizado. Tente novamente\n");
	}
}