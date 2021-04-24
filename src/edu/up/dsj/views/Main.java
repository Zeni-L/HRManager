package edu.up.dsj.views;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.println("----- HUMAN RESOURCES MANAGER ------\n");
			
			System.out.println("Escolha uma das op��es abaixo. Aperte 0 para sair\n");

			System.out.println("1. Novo Colaborador\n2. Listar Colaboradores");		
			
			System.out.print("\nEntre com a op��o desejada: ");
			escolha = sc.nextInt();
			switch (escolha) {

			case 1:
				CadastrarColaborador.cadastrar();
				break;
			case 2:
				ListarColaboradores.renderizar();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
				default:
					System.out.println("Op��o Inv�lida!\n");
					break;	
			}
		} while (escolha != 0);
		
		System.out.println("\nFim da execu��o do HR Manager - Todos os direitos reservados.");
		sc.close();
	}
}