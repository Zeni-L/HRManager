package edu.up.dsj.views;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.println("\n----- HUMAN RESOURCES MANAGER ------\n");
			
			System.out.println("Escolha uma das op��es abaixo. Aperte 0 para sair\n");

			System.out.println("1. Cadastrar Setor\n2. Setores Existentes\n3. Novo Funcion�rio"
					+ "\n4. Visualizar Funcion�rios");		
			
			System.out.print("\nEntre com a op��o desejada: ");
			escolha = sc.nextInt();
			switch (escolha) {

			case 1:
				CadastrarSetor.cadastrar();
				break;
			case 2:
				ListarSetores.renderizar();
				break;
			case 3:
				CadastrarColaborador.cadastrar();
				break;
			case 4:
				ListarColaboradores.renderizar();
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
				default:
					System.out.println("\nOp��o Inv�lida!\n");
					break;	
			}
		} while (escolha != 0);
		
		System.out.println("\nFim da execu��o do HR Manager - Todos os direitos reservados.");
		sc.close();
	}
}