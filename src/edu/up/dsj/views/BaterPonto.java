package edu.up.dsj.views;

import java.util.Scanner;
import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.FolhaPontoController;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.models.FolhaPonto;

/**
 * Classe para cadastrar o ponto do funcionario, somente um ponto por dia;
 * @author Cesar Augusto
 */
public class BaterPonto {

	private static Scanner sc = new Scanner(System.in);
	private static FolhaPonto ponto;
	private static String cpf;
	private static Colaborador funcionario;
	private static Object[] retorno;

	public static void renderizar() {
		ponto = new FolhaPonto();

		System.out.println("\n========= BATER PONTO =========\n");
		System.out.println("Digite o CPF do funcionario: ");
		cpf = sc.next();
		funcionario = ColaboradorController.buscarPorCpf(cpf);

		if (funcionario != null) {
			ponto.setFuncionario(funcionario);
			retorno = FolhaPontoController.verificaLivroPonto(ponto);

			int opcao = (int) retorno[0];
			switch (opcao) {
			case 1: {
				FolhaPontoController.pontoEntrada(ponto);
				System.out.println("\nFolha Ponto cadastrada");
				System.out.println("\nEntrada executada");
				break;
			}
			case 2: {
				FolhaPontoController.pontoSaida((int) retorno[1]);
				System.out.println("\nSaida executada");
				break;
			}
			default: {
				System.out.println("\nPonto do dia completo");
				break;
			}
			}

		} else {
			System.out.println("\nCPF não encontrado.");
		}
	}
}
