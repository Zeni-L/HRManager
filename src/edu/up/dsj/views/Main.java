package edu.up.dsj.views;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.println("\n----- HUMAN RESOURCES MANAGER ------\n");
			
			System.out.println("Escolha uma das opções abaixo. Aperte 0 para sair\n");

			System.out.println("1. Cadastrar Setor\n2. Setores Existentes\n3. Novo Funcionário"
					+ "\n4. Visualizar Funcionários");		
			
			System.out.print("\nEntre com a opção desejada: ");
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
					System.out.println("\nOpção Inválida!\n");
					break;	
			}
		} while (escolha != 0);
		
		System.out.println("\nFim da execução do HR Manager - Todos os direitos reservados.");
		sc.close();
	}
}