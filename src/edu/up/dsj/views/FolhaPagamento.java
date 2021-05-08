//Criando interface para o usuÃ¡rio inserir dados para o cÃ¡lculo de salÃ¡rio lÃ­quido ao final do mÃªs
//CÃ¡lculo no models pagamento.java
//@author: Julio Cezar

package edu.up.dsj.views;

import java.util.Scanner;

import edu.up.dsj.controller.ColaboradorController;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.controller.ValidarCpf;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.models.Pagamento;

public class FolhaPagamento {
	
	private static Colaborador colaborador;

	public static void calcularFolha() {

		Pagamento pagamento = new Pagamento();
		Scanner sc = new Scanner(System.in);
		String escolha, cpfColaborador;
		float salariobruto;
		
		
		do {
			System.out.println("\n ---- FOLHA DE PAGAMENTO ----\n");
			System.out.print("Digite o CPF do funcionário: ");
			cpfColaborador = sc.nextLine();
			colaborador = ColaboradorController.buscarPorCpf(cpfColaborador);
			if(colaborador != null) {
				salariobruto = colaborador.getSalarioBruto();
				pagamento.setSalarioBruto(salariobruto);
				pagamento.calcularINSS();
				pagamento.calcularIR();
				pagamento.calcularSalarioLiquido();
				System.out.println(pagamento.toString());				
				
			}
			else {
				
			}
			
			
			System.out.println("Deseja cadastrar mais colaboradores?");
			System.out.print("Aperte S para cadastrar mais ou qualquer tecla para sair: ");
			sc.nextLine();
			escolha = sc.nextLine();

		} while (escolha.equalsIgnoreCase("S"));
	}
}
