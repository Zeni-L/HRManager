package edu.up.dsj.views;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.PessoaFisica;
import edu.up.dsj.models.PessoaJuridica;
import edu.up.dsj.utils.Console;
import edu.up.dsj.utils.ValidarCnpj;
import edu.up.dsj.utils.ValidarCpf;

/**
 * Classe para cadastrar uma nova pessoa fisica ou juridica. Não permite
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
				System.out.println("\nPessoa física ou jurídica?");
				System.out.println("\n1. Pessoa Física\n2. Pessoa Juridica");

				cadastro = Console.lerInteiro("\nSelecione a opção: ");

				switch (cadastro) {

				case 1:
					PessoaFisica novapf = new PessoaFisica();

					novapf.setNome(Console.lerString("\nNome: "));
					novapf.setCpf(Console.lerString("CPF: "));

					if (ValidarCpf.isCPF(novapf.getCpf()) == true) {
						novapf.setTelefone(Console.lerString("Telefone de contato: "));
						novapf.setEndereco(Console.lerString("Endereço: "));

						System.out.println("\nCadastre o funcionário em um dos setores abaixo: ");
						ListarSetores.renderizar();

						codSetor = Console.lerInteiro("\nCódigo do setor: ");
						novapf.setSetor(SetorController.retornarSetor(codSetor));

						if (ColaboradorController.cadastrarPessoaFisica(novapf) == true) {
							System.out.println("\nColaborador Cadastrado!");
						} else {
							System.out.println("\nNão foi possível cadastrar");
						}
					} else {
						System.out.println("\nCNPJ inválido. Tente novamente.");
					}
					break;

				case 2:
					PessoaJuridica novapj = new PessoaJuridica();

					novapj.setNome(Console.lerString("\nNome: "));
					novapj.setCnpj(Console.lerString("CNPJ: "));

					if (ValidarCnpj.isCNPJ(novapj.getCnpj()) == true) {
						novapj.setTelefone(Console.lerString("Telefone de contato: "));
						novapj.setEndereco(Console.lerString("Endereço: "));

						System.out.println("\nCadastre o funcionário em um dos setores abaixo: ");
						ListarSetores.renderizar();

						codSetor = Console.lerInteiro("\nCódigo do setor: ");
						novapj.setSetor(SetorController.retornarSetor(codSetor));

						if (ColaboradorController.cadastrarPessoaJuridica(novapj) == true) {
							System.out.println("\nColaborador Cadastrado!");
						} else {
							System.out.println("\nNão foi possível cadastrar");
						}
					} else {
						System.out.println("\nCPF inválido. Tente novamente.");
					}
					break;

				}

				System.out.println("\nDeseja cadastrar mais colaboradores?");

				escolha = Console.lerString("Aperte S para cadastrar mais ou qualquer tecla para sair: ");

			} while (escolha.equalsIgnoreCase("S"));
		} else {
			System.out.println("\nNão há setores cadastrados. Cadastre um novo setor e tente novamente.");
		}

	}
}