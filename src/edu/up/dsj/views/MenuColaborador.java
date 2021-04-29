package edu.up.dsj.views;

import java.util.Scanner;

public class MenuColaborador {

	public static void isColaborador() {
		
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.println("\n========= COLABORADORES =========\n" + "Selecione uma das op��es abaixo:\n"
					+ "\n1. Cadastrar novo colaborador\n2. Listar todos os colaboradores\n3. Buscar colaborador");
			escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				CadastrarColaborador.cadastrar();
				break;
			case 2:
				ListarColaboradores.renderizar();
				break;
			case 3:
				System.out.println("Op��o ainda n�o configurada");
				break;
			case 0:
				System.out.println("Saindo...\n");
			default:
				System.out.println("Op��o inv�lida\n");
			}
		} while (escolha != 0);
	
	}	
}