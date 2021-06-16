package edu.up.dsj.views;

import java.util.Scanner;

import edu.up.dsj.utils.Console;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		
			do {
				System.out.println("========= HUMAN RESOURCES MANAGER =========\n");
				System.out.println("1. Setores" + "\n2. Funcionários" + "\n3. Ponto" + "\n4. Holerites" + "\n0. Sair");

					escolha = Console.lerInteiro("\nEntre com a opção desejada: ");

					switch (escolha) {

					case 1:
						MenuSetores.isSetor();
						break;
					case 2:
						MenuColaborador.isColaborador();
						break;
					case 3:
//						MenuPonto.isPonto();
						break;
					case 4:
						MenuFolhaPag.isHolerite();
						break;
					case 0:
						System.out.println("\nSaindo...");
						break;
					default:
						System.out.println("\nOpção Inválida!\n");
						break;
					}
			} while (escolha != 0);

		sc.close();
		System.out.println("\nFim da execução do HR Manager - Todos os direitos reservados.");
		
	}
}