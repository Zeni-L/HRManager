package edu.up.dsj.views;

import java.util.Scanner;

public class MenuSetores {

public static void isSetor() {
		
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.println("\n============ SETORES ============\n" + "Selecione uma das opções abaixo:\n"
					+ "\n1. Cadastrar novo setor\n2. Listar todos os setores\n0. Sair");
			
			System.out.print("\nEntre com a opção desejada: ");
			escolha = sc.nextInt();
			
			switch (escolha) {
			case 1:
				CadastrarSetor.cadastrar();
				break;
			case 2:
				ListarSetores.renderizar();
				break;
			case 0:
				System.out.println("Saindo...\n");
				break;
			default:
				System.out.println("Opção inválida\n");
				break;
			}
		} while (escolha != 0);
	
	}
	
}
