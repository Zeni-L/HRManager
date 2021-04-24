package edu.up.dsj.views;

import java.text.SimpleDateFormat;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.models.Colaborador;

public class ListarColaboradores {

	public static void renderizar() {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'ás' HH:mm");

		System.out.println("\n===== COLABORADORES =====\n");
		for (Colaborador colaborador : ColaboradorController.retornarListaColaboradores()) {
			System.out.println("Nome: " + colaborador.getNome() + " | CPF: " + colaborador.getCpf()
					+ " | Cadastrado em: " + formatter.format(colaborador.getCadastradoEm()));
		}
		System.out.println("\n================================\n");
	}
}