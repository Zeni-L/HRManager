package edu.up.dsj.views;

import java.util.Scanner;

public class MenuColaborador {

	public static void isColaborador() {

		Scanner sc = new Scanner(System.in);
		int escolha;

		do {
			System.out.println("\n========= COLABORADORES =========\n" + "\n1. Cadastrar novo colaborador"
					+ "\n2. Listar todos os colaboradores" + "\n3. Consultar colaboradores"
					+ "\n4. Editar informações de colaborador" + "\n5. Deletar colaborador"
					+ "\n6. Gerar folha de pagamento" + "\n0. Sair");

			System.out.print("\nEntre com a opção desejada: ");
			escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				CadastrarColaborador.cadastrar();
				break;
			case 2:
				ListarColaboradores.renderizar();
				break;
			case 3:
				BuscarColaborador.retornarColaborador();
				break;
			case 4:
				EditarColaborador.alterar();
				break;
			case 5:
				RemoverColaborador.remover();
				break;
			case 6:
				FolhaPagamento.calcularFolha();
				break;
			case 0:
				System.out.println("Saindo...\n");
				break;
			default:
				System.out.println("Opção inválida\n");
			}
		} while (escolha != 0);
	}
}