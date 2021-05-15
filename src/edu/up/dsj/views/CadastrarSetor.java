package edu.up.dsj.views;

import java.util.Scanner;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.controller.VagasController;
import edu.up.dsj.models.Setor;
import edu.up.dsj.models.Vaga;

/**
 * Classe para cadastrar novos setores da empresa. O c�digo de setor � gerado
 * automaticamente em sequ�ncia. N�o � poss�vel cadastrar setores com o mesmo
 * nome, mesmo se estiverem com letras mai�sculas.
 * @author Leandro Zeni
 */
public class CadastrarSetor {

	public static void cadastrar() {

		Scanner sc = new Scanner(System.in);
		Setor novoSetor = new Setor();
		Vaga novaVaga = new Vaga();

		System.out.println("\n========= NOVO SETOR =========\n");
		System.out.print("\nNome do setor: ");
		novoSetor.setNome(sc.nextLine());

		novoSetor.setCodigoSetor(SetorController.GerarCodSetor());

		if (SetorController.cadastrar(novoSetor) == true) {
			novaVaga.setSetor(novoSetor);
			System.out.println("Digite o total de vagas do setor: ");
			novaVaga.setTotalDeVagas(sc.nextInt());
			VagasController.cadastrar(novaVaga);
			System.out.println("\nNovo setor cadastrado!");
		} else {
			System.out.println("\nEsse setor j� existe. Por favor, cadastre outro");
		}
	}
}