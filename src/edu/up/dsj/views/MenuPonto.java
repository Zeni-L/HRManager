package edu.up.dsj.views;

import java.util.Scanner;

/**
 * Classe para visualização do menu de ponto pelo usuario.
 * @author Cesar Augusto
 */
public class MenuPonto {

	private static Scanner sc = new Scanner(System.in);
	private static int escolha;

	public static void isPonto() {
		do {
			System.out.println("\n========= PONTO =========\n");
			System.out.println("\n1. Bater ponto\n2. Calcular jornada trabalhado\n0. Sair");
			System.out.print("\nEntre com a opção desejada: ");
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				BaterPonto.renderizar();
				break;
			case 2:
				CalcularJornadaDeTrabalho.renderizar();
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