package edu.up.dsj.views;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.println("------------ HUMAN RESOURCES MANAGER -------------\n"
					+ "Escolha uma das opções abaixo. Aperte 0 para sair\n");

			System.out.println("1. Setores\n2. Funcionários\n0. Sair");		
			
			System.out.print("\nEntre com a opção desejada: ");
			escolha = sc.nextInt();
			switch (escolha) {

			case 1:
				MenuSetores.isSetor();
				break;
			case 2:
				MenuColaborador.isColaborador();
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