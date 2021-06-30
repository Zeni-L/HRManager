package edu.up.dsj.views;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.FuncionarioHora;
import edu.up.dsj.models.FuncionarioMes;
import edu.up.dsj.utils.Console;
import edu.up.dsj.utils.ValidarCpf;

/**
 * Classe para cadastrar uma nova pessoa fisica ou juridica. N�o permite
 * cadastrar pessoas com o mesmo CPF/CNPJ.
 * @author Leandro Zeni
 */
public class CadastrarFuncionario {

	public static void cadastrar() {

		if (!SetorController.retornarListaSetores().isEmpty()) {
			String escolha;

			do {
				int cadastro;
				int codSetor;

				System.out.println("\n========= NOVO COLABORADOR =========");
				System.out.println("\n1. Funcionario Horista\n2. Funcionario Mensalista");

				cadastro = Console.lerInteiro("\nSelecione a opção: ");

				switch (cadastro) {

				case 1:
					FuncionarioHora funcionarioHora = new FuncionarioHora();

					funcionarioHora.setNome(Console.lerString("\nNome: "));
					funcionarioHora.setCpf(Console.lerString("CPF: "));

					if (ValidarCpf.isCPF(funcionarioHora.getCpf()) == true) {
						funcionarioHora.setTelefone(Console.lerString("Telefone de contato: "));
						funcionarioHora.setEndereco(Console.lerString("Endereço: "));

						System.out.println("\nCadastre o funcionário em um dos setores abaixo: ");
						ListarSetores.renderizar();

						codSetor = Console.lerInteiro("\nCódigo do setor: ");
						funcionarioHora.setSetor(SetorController.retornarSetor(codSetor));
						funcionarioHora.setValorHora(Console.lerDouble("Valor da hora trabalhada: "));
						
						if (FuncionarioController.cadastrar(funcionarioHora) == true) {
							System.out.println("\nColaborador Cadastrado!");
						} else {
							System.out.println("\nNão foi possível cadastrar");
						}
					} else {
						System.out.println("\n CPF inválido. Tente novamente.");
					}
					break;

				case 2:
					FuncionarioMes funcionarioMes = new FuncionarioMes();

					funcionarioMes.setNome(Console.lerString("\nNome: "));
					funcionarioMes.setCpf(Console.lerString("CPF: "));

					if (ValidarCpf.isCPF(funcionarioMes.getCpf()) == true) {
						funcionarioMes.setTelefone(Console.lerString("Telefone de contato: "));
						funcionarioMes.setEndereco(Console.lerString("Endere�o: "));
						funcionarioMes.setSalarioBruto(Console.lerDouble("Sal�rio: "));

						System.out.println("\nCadastre o funcion�rio em um dos setores abaixo: ");
						ListarSetores.renderizar();

						codSetor = Console.lerInteiro("\nC�digo do setor: ");
						funcionarioMes.setSetor(SetorController.retornarSetor(codSetor));

						if (FuncionarioController.cadastrar(funcionarioMes) == true) {
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