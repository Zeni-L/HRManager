package edu.up.dsj.views;

import java.text.SimpleDateFormat;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.utils.Console;

public class BuscarFuncionario {

	public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

	public static void imprimirColaborador() {

		String cpf;

		System.out.println("\n========= CONSULTAR COLABORADORES =========\n");

		cpf = Console.lerString("CPF: ");

		Funcionario funcionario = new Funcionario();
		funcionario = FuncionarioController.buscarPorCpf(cpf);

		if (funcionario != null) {
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("CPF: " + funcionario.getCpf());
			System.out.println("Contato: " + funcionario.getTelefone());
			System.out.println("Data de Contratação: " + formatter.format(funcionario.getCadastradoEm()));
			System.out.println("Setor: " + funcionario.getSetor().getNome());
		} else
			System.out.println("\nColaborador não cadastrado. Tente novamente\n");
	}
}