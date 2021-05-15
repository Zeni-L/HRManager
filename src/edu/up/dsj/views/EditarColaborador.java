package edu.up.dsj.views;

import java.util.Scanner;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.controller.VagasController;
import edu.up.dsj.models.Colaborador;

public class EditarColaborador {

	public static void alterar() {

		Scanner sc = new Scanner(System.in);
		Colaborador colaborador = new Colaborador();
		String cpf;

		System.out.println("\n========= ALTERAR INFORMAÇÕES =========\n");
		System.out.print("Insira o CPF do colaborador: ");
		cpf = sc.nextLine();

		colaborador = ColaboradorController.buscarPorCpf(cpf);

		if (colaborador != null) {

			int escolha, retorno;
			Integer codSetor;
			System.out.println("\n1. Nome" + "\n2. Telefone" + "\n3. Endereço" + "\n4.Salario" + "\n5. Setor");
			System.out.print("\nQual das informações deseja alterar? ");
			escolha = sc.nextInt();

			switch (escolha) {

			case 1:
				System.out.print("Alterar nome: ");
				sc.nextLine();
				colaborador.setNome(sc.nextLine());
				break;
			case 2:
				System.out.print("Alterar telefone: ");
				sc.nextLine();
				colaborador.setTelefone(sc.nextLong());
				break;
			case 3:
				System.out.print("Alterar endereço: ");
				sc.nextLine();
				colaborador.setEndereco(sc.nextLine());
				break;
			case 4:
				System.out.print("Alterar salario: ");
				colaborador.setSalarioBruto(sc.nextFloat());
				break;
			case 5:
				codSetor = colaborador.getSetor().getCodigoSetor();
				retorno = VagasController.acharVaga(codSetor);
				VagasController.liberarVaga(retorno);
				System.out.print("Alterar setor. Escolha um dos setores abaixo: ");
				ListarSetores.renderizar();
				codSetor = sc.nextInt();
				colaborador.setSetor(SetorController.retornarSetor(codSetor));
				retorno = VagasController.acharVaga(codSetor);
				VagasController.preencherVaga(retorno);
				break;
			default:
				System.out.println("\nOpção inválida. Tente novamente\n");
			}
		}
	}
}
