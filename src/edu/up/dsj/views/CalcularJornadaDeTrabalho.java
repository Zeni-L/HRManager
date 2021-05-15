package edu.up.dsj.views;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.FolhaPontoController;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.models.FolhaPonto;

/**
 * Classe para visualização do calculo diario da jornada de trabalho pelo
 * usuario.
 * @author Cesar Augusto
 */
public class CalcularJornadaDeTrabalho {

	private static DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	private static DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static Scanner sc = new Scanner(System.in);
	private static FolhaPonto ponto;
	private static String cpf;
	private static Colaborador funcionario;
	private static Object[] retorno;

	public static void renderizar() {
		ponto = new FolhaPonto();

		System.out.println("\n========= JORNADA DE TRABALHO DIARIA =========\n");
		System.out.println("Digite o CPF do funcionário: ");
		cpf = sc.nextLine();
		funcionario = ColaboradorController.buscarPorCpf(cpf);

		if (funcionario != null) {
			ponto.setFuncionario(funcionario);
			System.out.println("Digite a data da folha (dd mm aaaa)");
			String data = sc.nextLine();
			data = data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2);
			ponto.setDiaDoPonto(LocalDate.parse(data));

			retorno = FolhaPontoController.verificaLivroPonto(ponto);
			int opcao = (int) retorno[0];

			switch (opcao) {
			case 1:
				System.out.println("Folha ponto não existe!");
				break;
			case 2:
				System.out.println("Folha ponto não está completa!");
				break;
			case 3:
				ponto = FolhaPontoController.getFolha((int) retorno[1]);
				retorno = FolhaPontoController.calcularFolha(ponto);
				System.out.println("\nNome: " + ponto.getFuncionario().getNome() + "\nMatricula: "
						+ ponto.getFuncionario().getMatricula() + "\nData da folha ponto: "
						+ ponto.getDiaDoPonto().format(dataFormatter) + "\nHora entrada: "
						+ ponto.getEntrada().format(horaFormatter) + "\nHora Saida: "
						+ ponto.getSaida().format(horaFormatter) + "\nJornada de trabalhado: " + retorno[0] + ":"
						+ retorno[1] + ":" + retorno[2]);
				break;
			}

		} else {
			System.out.println("\nCPF não encontrado.");
		}
	}
}
