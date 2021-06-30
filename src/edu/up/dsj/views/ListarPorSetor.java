package edu.up.dsj.views;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.utils.Console;

public class ListarPorSetor {

	private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'ás' HH:mm");
	
	public static void listarFuncSetores() {
		
		System.out.println("======== LISTAR FUNCIONARIOS POR SETORES ========");
		
		int codSetor;
		
		codSetor = Console.lerInteiro("Insira o código do setor: ");
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios = FuncionarioController.retornarListaFuncionarios();
		
		for(Funcionario funcionariosCadastrados : funcionarios) {
			if(funcionariosCadastrados.getSetor().getCodigoSetor().equals(codSetor)) {
				System.out.println("Nome: " + funcionariosCadastrados.getNome() + " | Setor: "
						+ funcionariosCadastrados.getSetor().getNome() + " | Cadastrado em: "
						+ formatter.format(funcionariosCadastrados.getCadastradoEm()) + " | Endereço: " + funcionariosCadastrados.getEndereco()
						+ "\n");
			}
		}		
	}
}