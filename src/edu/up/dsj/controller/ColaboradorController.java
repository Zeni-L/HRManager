package edu.up.dsj.controller;

import java.util.ArrayList;
import edu.up.dsj.models.Colaborador;

public class ColaboradorController {

	private static ArrayList<Colaborador> funcionarios = new ArrayList<Colaborador>();

	public static boolean cadastrar(Colaborador novoColaborador) {

		boolean colaboradorCadastrado = false;

		if (funcionarios.isEmpty()) {
			funcionarios.add(novoColaborador);
			colaboradorCadastrado = true;
		} else {
			for (Colaborador funcionariosCadastrados : funcionarios) {
				if (funcionariosCadastrados.getCpf().equals(novoColaborador.getCpf())) {
					break;
				} else {
					funcionarios.add(novoColaborador);
					colaboradorCadastrado = true;
				}
			}
		}

		return colaboradorCadastrado;
	}
	
	public static ArrayList<Colaborador> retornarListaColaboradores(){
		return funcionarios;
	}
	
}