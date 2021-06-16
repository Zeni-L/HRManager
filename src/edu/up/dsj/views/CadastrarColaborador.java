package edu.up.dsj.views;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.PessoaFisica;
import edu.up.dsj.models.PessoaJuridica;
import edu.up.dsj.utils.Console;
import edu.up.dsj.utils.ValidarCnpj;
import edu.up.dsj.utils.ValidarCpf;

/**
 * Classe para cadastrar uma nova pessoa fisica ou juridica. N�o permite
 * cadastrar pessoas com o mesmo CPF/CNPJ.
 * @author Leandro Zeni
 */
public class CadastrarColaborador {

	public static void cadastrar() {

		if (!SetorController.retornarListaSetores().isEmpty()) {
			String escolha;

			do {
				int cadastro;
				int codSetor;

				System.out.println("\n========= NOVO COLABORADOR =========");
				System.out.println("\nPessoa f�sica ou jur�dica?");
				System.out.println("\n1. Pessoa F�sica\n2. Pessoa Juridica");

				cadastro = Console.lerInteiro("\nSelecione a op��o: ");

				switch (cadastro) {

				case 1:
					PessoaFisica novapf = new PessoaFisica();

					novapf.setNome(Console.lerString("\nNome: "));
					novapf.setCpf(Console.lerString("CPF: "));

					if (ValidarCpf.isCPF(novapf.getCpf()) == true) {
						novapf.setTelefone(Console.lerString("Telefone de contato: "));
						novapf.setEndereco(Console.lerString("Endere�o: "));

						System.out.println("\nCadastre o funcion�rio em um dos setores abaixo: ");
						ListarSetores.renderizar();

						codSetor = Console.lerInteiro("\nC�digo do setor: ");
						novapf.setSetor(SetorController.retornarSetor(codSetor));

						if (ColaboradorController.cadastrarPessoaFisica(novapf) == true) {
							System.out.println("\nColaborador Cadastrado!");
						} else {
							System.out.println("\nN�o foi poss�vel cadastrar");
						}
					} else {
						System.out.println("\nCNPJ inv�lido. Tente novamente.");
					}
					break;

				case 2:
					PessoaJuridica novapj = new PessoaJuridica();

					novapj.setNome(Console.lerString("\nNome: "));
					novapj.setCnpj(Console.lerString("CNPJ: "));

					if (ValidarCnpj.isCNPJ(novapj.getCnpj()) == true) {
						novapj.setTelefone(Console.lerString("Telefone de contato: "));
						novapj.setEndereco(Console.lerString("Endere�o: "));

						System.out.println("\nCadastre o funcion�rio em um dos setores abaixo: ");
						ListarSetores.renderizar();

						codSetor = Console.lerInteiro("\nC�digo do setor: ");
						novapj.setSetor(SetorController.retornarSetor(codSetor));

						if (ColaboradorController.cadastrarPessoaJuridica(novapj) == true) {
							System.out.println("\nColaborador Cadastrado!");
						} else {
							System.out.println("\nN�o foi poss�vel cadastrar");
						}
					} else {
						System.out.println("\nCPF inv�lido. Tente novamente.");
					}
					break;

				}

				System.out.println("\nDeseja cadastrar mais colaboradores?");

				escolha = Console.lerString("Aperte S para cadastrar mais ou qualquer tecla para sair: ");

			} while (escolha.equalsIgnoreCase("S"));
		} else {
			System.out.println("\nN�o h� setores cadastrados. Cadastre um novo setor e tente novamente.");
		}

	}
}