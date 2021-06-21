package edu.up.dsj.views;

import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Setor;
import edu.up.dsj.utils.Console;

/**
 * Classe para cadastrar novos setores da empresa. O código de setor é gerado
 * automaticamente em sequência. Não é possível cadastrar setores com o mesmo
 * nome, mesmo se estiverem com letras maiúsculas.
 * 
 * @author Leandro Zeni
 */
public class CadastrarSetor {

	public static void cadastrar() {

		Setor novoSetor = new Setor();

		System.out.println("\n========= NOVO SETOR =========\n");
		novoSetor.setNome(Console.lerString("Nome do setor: "));

		novoSetor.setCodigoSetor(SetorController.gerarCodSetor());

		if (SetorController.cadastrar(novoSetor) == true) {
			System.out.println("\nNovo setor cadastrado!");
		} else {
			System.out.println("\nEsse setor já existe. Por favor, cadastre outro");
		}
	}
}