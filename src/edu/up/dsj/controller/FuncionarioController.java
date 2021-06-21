package edu.up.dsj.controller;

import java.util.ArrayList;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.models.FuncionarioHora;
import edu.up.dsj.models.FuncionarioMes;

/**
 * Classe para controle de cadastros e manipulação de ArrayList para o objeto
 * Colaborador.
 * 
 * @author Leandro Zeni
 */
public class FuncionarioController {

	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private static ArrayList<FuncionarioHora> funcionariosHoristas = new ArrayList<FuncionarioHora>();
	private static ArrayList<FuncionarioMes> funcionariosMensalistas = new ArrayList<FuncionarioMes>();

	public static boolean cadastrar(Funcionario funcionario) {

		for (Funcionario funcionariosCadastrados : funcionarios) {
			if (funcionariosCadastrados.getCpf().equals(funcionario.getCpf())) {
				return false;
			}
		}

		funcionarios.add(funcionario);

		if (funcionario instanceof FuncionarioHora) {
			funcionariosHoristas.add((FuncionarioHora) funcionario);
		} else {
			funcionariosMensalistas.add((FuncionarioMes) funcionario);
		}

		return true;
	}

	public static ArrayList<Funcionario> retornarListaFuncionarios() {
		return funcionarios;
	}
	
	public static ArrayList<FuncionarioHora> retornarListaHoristas() {
		return funcionariosHoristas;
	}
	
	public static ArrayList<FuncionarioMes> retornarListaMensalistas() {
		return funcionariosMensalistas;
	}

	public static Funcionario buscarPorCpf(String cpf) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getCpf().equals(cpf)) {
				return funcionario;
			}
		}
		return null;
	}

	public static boolean deletar(Funcionario funcionario) {

		boolean deletado = false;

		for (Funcionario funcionariosCadastrados : funcionarios) {
			if (funcionariosCadastrados.getCpf().equals(funcionario.getCpf())) {
				funcionarios.remove(funcionario);
				if(funcionario instanceof FuncionarioHora) {
					funcionariosHoristas.remove(funcionario);
				}else {
					funcionariosMensalistas.remove(funcionario);
				}
				deletado = true;
				break;
			}
		}

		return deletado;
	}
}