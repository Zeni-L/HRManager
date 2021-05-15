package edu.up.dsj.views;


import java.util.Scanner;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.controller.VagasController;
import edu.up.dsj.controller.ValidarCpf;
import edu.up.dsj.models.Colaborador;

/**
 * Classe para cadastrar um novo colaborador. Não permite cadastrar pessoas com o mesmo CPF.
 * @author Leandro Zeni
 */
public class CadastrarColaborador {

	public static void cadastrar() {

		Scanner sc = new Scanner(System.in);
		String escolha;

		do {
			Colaborador novoColaborador = new Colaborador();
			Integer codSetor;
			int vaga;

			System.out.println("\n ========= NOVO COLABORADOR =========\n");
			System.out.print("Nome: ");
			novoColaborador.setNome(sc.nextLine());
			System.out.print("CPF: ");
			novoColaborador.setCpf(sc.nextLine());
			if (ValidarCpf.isCPF(novoColaborador.getCpf()) == true) {
				System.out.print("Telefone para contato: ");
				novoColaborador.setTelefone(sc.nextLong());
				sc.nextLine();
				System.out.print("Endereço: ");
				novoColaborador.setEndereco(sc.nextLine());
				System.out.print("Salário Bruto: ");
				novoColaborador.setSalarioBruto(sc.nextFloat());
				System.out.println("\nCadastre o funcionário em um dos setores abaixo: ");
				ListarSetores.renderizar();
				System.out.print("\nCódigo do Setor: ");
				codSetor = (sc.nextInt());
				novoColaborador.setSetor(SetorController.retornarSetor(codSetor));
				vaga = VagasController.acharVaga(codSetor);
				if (ColaboradorController.cadastrar(novoColaborador) == true) {
					VagasController.preencherVaga(vaga);
					System.out.println("\nColaborador Cadastrado!\n");
				} else {
					System.out.println("\nNï¿½o foi possï¿½vel cadastrar\n");
				}
			}
			else
				System.out.println("\nCPF inválido. Tente novamente.");

			System.out.println("Deseja cadastrar mais colaboradores?");
			System.out.print("Aperte S para cadastrar mais ou qualquer tecla para sair: ");
			sc.nextLine();
			escolha = sc.nextLine();

		} while (escolha.equalsIgnoreCase("S"));

	}
}