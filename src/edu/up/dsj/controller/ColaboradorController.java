package edu.up.dsj.controller;

import java.util.ArrayList;
import edu.up.dsj.models.Colaborador;
import edu.up.dsj.models.PessoaFisica;
import edu.up.dsj.models.PessoaJuridica;

/**
 * Classe para controle de cadastros e manipulação de ArrayList para o objeto Colaborador.
 * @author Leandro Zeni
 */
public class ColaboradorController {

	private static ArrayList<Colaborador> funcionarios = new ArrayList<Colaborador>();
	private static ArrayList<PessoaFisica> funcionariosPf = new ArrayList <PessoaFisica>();
	private static ArrayList<PessoaJuridica> funcionariosPj = new ArrayList<PessoaJuridica>();

	public static boolean cadastrarPessoaFisica(PessoaFisica novaPf) {

		for (PessoaFisica funcionariosCadastrados : funcionariosPf) {
			if (funcionariosCadastrados.getCpf().equals(novaPf.getCpf())) {
				return false;
			}
		}

		funcionarios.add(novaPf);
		funcionariosPf.add(novaPf);
		return true;
	}
	
	public static boolean cadastrarPessoaJuridica(PessoaJuridica novaPj) {

		for (PessoaJuridica funcionariosCadastrados :  funcionariosPj) {
			if (funcionariosCadastrados.getCnpj().equals(novaPj.getCnpj())) {
				return false;
			}
		}

		funcionarios.add(novaPj);
		funcionariosPj.add(novaPj);
		return true;
	}

	public static ArrayList<Colaborador> retornarListaColaboradores() {
		return funcionarios;
	}
	
	public static ArrayList<PessoaFisica> retornarListaPfs() {
		return funcionariosPf;
	}
	
	public static ArrayList<PessoaJuridica> retornarListaPjs() {
		return funcionariosPj;
	}

	public static PessoaFisica buscarPorCpf(String cpf) {
		for (PessoaFisica pfCadastrado : funcionariosPf) {
			if (pfCadastrado.getCpf().equals(cpf)) {
				return pfCadastrado;
			}
		}
		return null;
	}
	
	public static PessoaJuridica buscarPorCnpj(String cnpj) {
		for (PessoaJuridica pjCadastrado : funcionariosPj) {
			if (pjCadastrado.getCnpj().equals(cnpj)) {
				return pjCadastrado;
			}
		}
		return null;
	}

//	public static boolean deletar(PessoaFisica novoColaborador) {
//
//		boolean deletado = false;
//
//		for (Colaborador funcionariosCadastrados : funcionarios) {
//			if (funcionariosCadastrados.getCpf().equals(novoColaborador.getCpf())) {
//				funcionarios.remove(novoColaborador);
//				deletado = true;
//				break;
//			}
//		}
//
//		return deletado;
//	}
//
//	public static boolean atualizar(Colaborador colaborador) {
//
//		funcionarios.add(colaborador);
//
//		return true;
//	}
}