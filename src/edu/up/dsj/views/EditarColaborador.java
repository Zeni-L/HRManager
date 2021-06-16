package edu.up.dsj.views;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.controller.VagasController;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.utils.Console;

public class EditarColaborador {

	public static void alterar() {

		Colaborador colaborador = new Colaborador();
		String cpf;

		System.out.println("\n========= ALTERAR INFORMA��ES =========\n");
		cpf = Console.lerString("Insira o CPF do colaborador: ");

		colaborador = ColaboradorController.buscarPorCpf(cpf);

		if (colaborador != null) {

			int escolha, retorno;
			Integer codSetor;
			System.out.println("\n1. Nome" + "\n2. Telefone" + "\n3. Endere�o" + "\n4.Salario" + "\n5. Setor");
			escolha = Console.lerInteiro("\nQual das informa��es deseja alterar? ");

			switch (escolha) {

			case 1:
				colaborador.setNome(Console.lerString("Alterar nome: "));
				break;
			case 2:
				colaborador.setTelefone(Console.lerString("Alterar telefone: "));
				break;
			case 3:
				colaborador.setEndereco(Console.lerString("Alterar endere�o: "));
				break;
			case 4:
				codSetor = colaborador.getSetor().getCodigoSetor();
				retorno = VagasController.acharVaga(codSetor);
				VagasController.liberarVaga(retorno);
				System.out.print("Alterar setor. Escolha um dos setores abaixo: ");
				ListarSetores.renderizar();
				codSetor = Console.lerInteiro("Setor: ");
				colaborador.setSetor(SetorController.retornarSetor(codSetor));
				retorno = VagasController.acharVaga(codSetor);
				VagasController.preencherVaga(retorno);
				break;
			default:
				System.out.println("\nOp��o inv�lida. Tente novamente\n");
			}
		}
	}
}