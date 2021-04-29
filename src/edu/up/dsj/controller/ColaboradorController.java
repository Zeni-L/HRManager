package edu.up.dsj.controller;

import java.util.ArrayList;
import edu.up.dsj.models.Colaborador;

/**
 * Classe para controle de cadastros e manipulação de ArrayList para o objeto Colaborador.
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
	
	public static ArrayList<Colaborador> retornarListaColaboradores(){
		return funcionarios;
	}
}