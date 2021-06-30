package edu.up.dsj.views;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.models.FuncionarioHora;
import edu.up.dsj.models.FuncionarioMes;
import edu.up.dsj.utils.Console;

/**
 * Classe para imprimir a lista de colaboradores na tela para os usuários.
 * @author Leandro Zeni
 */
public class ListarFuncionarios {

	private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'ás' HH:mm");
	
	public static void renderizarTodos() {

		System.out.println("\n========= TODOS OS COLABORADORES =========\n");
		for (Funcionario colaborador : FuncionarioController.retornarListaFuncionarios()) {
			System.out.println("Nome: " + colaborador.getNome() + " | Setor: "
					+ colaborador.getSetor().getNome() + " | Cadastrado em: "
					+ formatter.format(colaborador.getCadastradoEm()) + " | Endereço: " + colaborador.getEndereco()
					+ "\n");
		}
		System.out.println("\n=================================\n");
	}
	
	public static void renderizarHoristas() {

		System.out.println("\n========= COLABORADORES HORISTAS =========\n");
		for (FuncionarioHora colaborador : FuncionarioController.retornarListaHoristas()) {
			System.out.println("Nome: " + colaborador.getNome() + " | Setor: "
					+ colaborador.getSetor().getNome() + " | Cadastrado em: "
					+ formatter.format(colaborador.getCadastradoEm()) + " | Endereço: " + colaborador.getEndereco()
					+ "\n");
		}
		System.out.println("\n=================================\n");
	}
	
	public static void renderizarMensalistas() {

		System.out.println("\n========= COLABORADORES MENSALISTAS =========\n");
		System.out.println("codigoSetor = Console.lerInteiro(\"Insira o CÃ³digo do setor: \");");
		for (Funcionario colaborador : FuncionarioController.retornarListaMensalistas()) {
			System.out.println("Nome: " + colaborador.getNome() + " | Setor: "
					+ colaborador.getSetor().getNome() + " | Cadastrado em: "
					+ formatter.format(colaborador.getCadastradoEm()) + " | Endereço: " + colaborador.getEndereco()
					+ "\n");
		}
		System.out.println("\n=================================\n");
	}
	
	public static void renderizarPorSetor() {
		ArrayList<Funcionario> funcionariosPorSetor;
		int codigoSetor;
		
		System.out.println("\n========= COLABORADORES SETOR =========\n");
		codigoSetor = Console.lerInteiro("Insira o Codigo do setor: ");
		funcionariosPorSetor = FuncionarioController.listarPorSetor(codigoSetor);
		for (Funcionario colaborador : funcionariosPorSetor) {
			System.out.println("Nome: " + colaborador.getNome() + " | Setor: "
					+ colaborador.getSetor().getNome() + " | Cadastrado em: "
					+ formatter.format(colaborador.getCadastradoEm()) + " | Endereço: " + colaborador.getEndereco()
					+ "\n");
		}
		System.out.println("\n=================================\n");
	}
}