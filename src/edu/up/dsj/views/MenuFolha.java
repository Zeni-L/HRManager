package edu.up.dsj.views;

import edu.up.dsj.utils.Console;

public class MenuFolha {

	public static void isHolerite() {

		int escolha;

		do {
			System.out.println("\n========= HOLERITES =========\n");
			System.out.println("1. Gerar folha de pagamento" + "\n2. Imprimir Holerite" + "\n0. Sair");

			escolha = Console.lerInteiro("\nEntre com a opção desejada: ");
			switch (escolha) {
			case 1:
				CadastrarFolha.calcularFolha();
				break;
			case 2:
				ImprimirFolha.gerarFolha();
				break;
			case 0:
				System.out.println("Saindo...\n");
				break;
			default:
				System.out.println("Op��o inv�lida\n");
			}
		} while (escolha != 0);
	}
}