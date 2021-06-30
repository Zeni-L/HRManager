package edu.up.dsj.views;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.models.FuncionarioHora;
import edu.up.dsj.models.FuncionarioMes;
import edu.up.dsj.utils.Console;

public class EditarFuncionario {

	public static void alterar() {

		Funcionario funcionario = new Funcionario();
		String cpf;

		System.out.println("\n========= ALTERAR INFORMAÇÕES =========\n");
		cpf = Console.lerString("Insira o CPF do colaborador: ");

		funcionario = FuncionarioController.buscarPorCpf(cpf);
		Integer codSetor;

		if (funcionario != null) {

			int escolha;
			System.out.println("\n1. Nome" + "\n2. Telefone" + "\n3. Endere�o" + "\n4. Salario" + "\n5. Setor");
			escolha = Console.lerInteiro("\nQual das informações deseja alterar? ");

			switch (escolha) {

			case 1:
				funcionario.setNome(Console.lerString("Alterar nome: "));
				System.out.println("\nDado atualizado!");

				break;
			case 2:
				funcionario.setTelefone(Console.lerString("Alterar telefone: "));
				System.out.println("\nDado atualizado!");

				break;
			case 3:
				funcionario.setEndereco(Console.lerString("Alterar endere�o: "));
				System.out.println("\nDado atualizado!");

				break;
			case 4:
				if(funcionario instanceof FuncionarioMes) {
					
					((FuncionarioMes) funcionario).setSalarioBruto(Console.lerDouble("Novo valor: "));
					System.out.println("\nDado atualizado!");

				}else {
					
					((FuncionarioHora) funcionario).setValorHora(Console.lerDouble("Novo valor da hora: "));
					System.out.println("\nDado atualizado!");

				}
				break;
			case 5:
				codSetor = funcionario.getSetor().getCodigoSetor();
				System.out.print("Alterar setor. Escolha um dos setores abaixo: ");
				ListarSetores.renderizar();
				codSetor = Console.lerInteiro("Setor: ");
				funcionario.setSetor(SetorController.retornarSetor(codSetor));
				System.out.println("\nDado atualizado!");

				break;
			default:
				System.out.println("\nOpção inválida. Tente novamente\n");
			}
		}
	}
}