package edu.up.dsj.views;

import java.util.Scanner;
import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.controller.ValidarCpf;
import edu.up.dsj.models.Colaborador;

/**
 * Classe para cadastrar um novo colaborador. N�o permite cadastrar pessoas com
 * o mesmo CPF.
 * 
 * @author Leandro Zeni
 */
public class CadastrarColaborador {

	public static void cadastrar() {

		Scanner sc = new Scanner(System.in);
		Colaborador novoColaborador = new Colaborador();
		Integer codSetor;

		System.out.println("\n ---- NOVO COLABORADOR ----\n");

		System.out.print("Nome: ");
		novoColaborador.setNome(sc.nextLine());

		System.out.print("CPF: ");
		novoColaborador.setCpf(sc.nextLine());

		if (ValidarCpf.isCPF(novoColaborador.getCpf()) == true) {
			System.out.print("Telefone para contato: ");
			novoColaborador.setTelefone(sc.nextLong());
			System.out.print("Endere�o: ");
			novoColaborador.setEndereco(sc.nextLine());
			System.out.print("Sal�rio Bruto: ");
			novoColaborador.setSalario(sc.nextFloat());
			System.out.println("\nCadastre o funcion�rio em um dos setores abaixo: ");
			ListarSetores.renderizar();
			System.out.print("\nC�digo do Setor: ");
			codSetor = (sc.nextInt());
			novoColaborador.setSetor(SetorController.retornarSetor(codSetor));
			if (ColaboradorController.cadastrar(novoColaborador) == true) {
				System.out.println("\nColaborador Cadastrado!");
			} else {
				System.out.println("\nN�o foi poss�vel cadastrar");
			}
		}else
			System.out.println("\nCPF inv�lido. Tente novamente.");
	}
}