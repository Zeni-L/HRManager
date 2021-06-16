package edu.up.dsj.views;

import java.text.SimpleDateFormat;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.models.PessoaFisica;
import edu.up.dsj.models.PessoaJuridica;
import edu.up.dsj.utils.Console;

public class BuscarColaborador {

	public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void imprimirColaborador() {

		String cadastro;
		
		System.out.println("\n========= CONSULTAR COLABORADORES =========\n");

		cadastro = Console.lerString("CPF ou CNPJ: ");

		if(cadastro.length() == 9) {
			
			PessoaFisica colaboradorpf = new PessoaFisica();
			colaboradorpf = ColaboradorController.buscarPorCpf(cadastro);

			if (colaboradorpf != null) {
				System.out.println("Nome: " + colaboradorpf.getNome());
				System.out.println("CPF: " + colaboradorpf.getCpf());
				System.out.println("Contato: " + colaboradorpf.getTelefone());
				System.out.println("Data de Contratação: " + formatter.format(colaboradorpf.getCadastradoEm()));
				System.out.println("Setor: " + colaboradorpf.getSetor().getNome());
			} else
				System.out.println("\nColaborador não cadastrado. Tente novamente\n");
		}else {
			
			PessoaJuridica colaboradorpj = new PessoaJuridica();
			colaboradorpj = ColaboradorController.buscarPorCnpj(cadastro);

			if (colaboradorpj != null) {
				System.out.println("Nome: " + colaboradorpj.getNome());
				System.out.println("CPF: " + colaboradorpj.getCnpj());
				System.out.println("Contato: " + colaboradorpj.getTelefone());
				System.out.println("Data de Contratação: " + formatter.format(colaboradorpj.getCadastradoEm()));
				System.out.println("Setor: " + colaboradorpj.getSetor().getNome());
			} else
				System.out.println("\nColaborador não cadastrado. Tente novamente\n");
		}
	}
}