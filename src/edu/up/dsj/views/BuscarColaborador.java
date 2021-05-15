package edu.up.dsj.views;

import java.util.Scanner;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.models.Colaborador;

public class BuscarColaborador {

	public static void retornarColaborador() {

		Scanner sc = new Scanner(System.in);
		Colaborador colaborador = new Colaborador();
		String cpf;

		System.out.println("\n========= CONSULTAR COLABORADORES =========\n");
		System.out.print("CPF do colaborador: ");
		cpf = sc.nextLine();

		colaborador = ColaboradorController.buscarPorCpf(cpf);

		if (colaborador != null) {
			System.out.println(colaborador);
		} else
			System.out.println("Colaborador não cadastrado. Tente novamente");
	}
}