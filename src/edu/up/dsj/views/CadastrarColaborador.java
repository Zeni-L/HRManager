package edu.up.dsj.views;

import java.util.Scanner;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.models.Colaborador;

public class CadastrarColaborador {

	public static void cadastrar() {

		Scanner sc = new Scanner(System.in);
		Colaborador novoColaborador = new Colaborador();

		System.out.println("\n ---- NOVO COLABORADOR ----\n");

		System.out.print("Nome: ");
		novoColaborador.setNome(sc.nextLine());

		System.out.print("CPF: ");
		novoColaborador.setCpf(sc.nextLine());

		if (ColaboradorController.cadastrar(novoColaborador) == true) {
			System.out.println("\nColaborador Cadastrado!\n");
		}else {
			System.out.println("Não foi possível cadastrar");
		}
	}
}