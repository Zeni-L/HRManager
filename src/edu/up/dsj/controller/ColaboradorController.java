package edu.up.dsj.controller;

import java.util.ArrayList;
import edu.up.dsj.models.Colaborador;

/**
 * Classe para controle de cadastros e manipula��o de ArrayList para o objeto Colaborador.
 * @author Leandro Zeni
 */
public class ColaboradorController {

	private static ArrayList<Colaborador> funcionarios = new ArrayList<Colaborador>();

	public static boolean cadastrar(Colaborador novoColaborador) {

		for (Colaborador funcionariosCadastrados : funcionarios) {
			if (funcionariosCadastrados.getCpf().equals(novoColaborador.getCpf())) {
				return false;
			}
		}

		funcionarios.add(novoColaborador);
		return true;

	}

	public static ArrayList<Colaborador> retornarListaColaboradores() {
		return funcionarios;
	}

	public static Colaborador buscarPorCpf(String cpf) {
		for (Colaborador funcionariosCadastrados : funcionarios) {
			if (funcionariosCadastrados.getCpf().equals(cpf)) {
				return funcionariosCadastrados;
			}
		}
		return null;
	}

	public static boolean deletar(Colaborador novoColaborador) {

		boolean deletado = false;

		for (Colaborador funcionariosCadastrados : funcionarios) {
			if (funcionariosCadastrados.getCpf().equals(novoColaborador.getCpf())) {
				funcionarios.remove(novoColaborador);
				deletado = true;
				break;
			}
		}

		return deletado;
	}

	public static boolean atualizar(Colaborador colaborador) {

		funcionarios.add(colaborador);

		return true;
	}
}