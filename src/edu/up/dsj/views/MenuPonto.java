package edu.up.dsj.views;

import java.util.Scanner;

public class MenuPonto {
		
	public static void isPonto() {
	
		Scanner sc = new Scanner(System.in);
		int escolha;
			
		do {
			System.out.println("\n========= PONTO =========\n" + "Selecione uma das opçoes abaixo:\n"
					+ "\n1. Bater ponto\n2. Calcular tempo trabalhado\n0. Sair");
			
			System.out.print("\nEntre com a opção desejada: ");
			escolha = sc.nextInt();
			switch (escolha) {
				case 1:
					BaterPonto.renderizar();
					break;
				case 2:
					System.out.println(" ");
					break;
				case 0:
					System.out.println("Saindo...\n");
					break;
				default:
					System.out.println("Opção inválida\n");
					break;
			}
		}while(escolha != 0);
	}		
}
