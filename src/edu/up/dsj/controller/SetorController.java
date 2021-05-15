package edu.up.dsj.controller;

import java.util.ArrayList;
import edu.up.dsj.models.Setor;

/**
 * Classe para controle de cadastros de novos setores e manipulação de ArrayList para o objeto Setor.
 * @author Leandro Zeni
 */
public class SetorController {

	private static ArrayList<Setor> setores = new ArrayList<Setor>();

	private static Integer id = 1;

	public static boolean cadastrar(Setor novoSetor) {

		for(Setor setoresCadastrados : setores) {
			if(setoresCadastrados.getNome().equalsIgnoreCase(novoSetor.getNome())) {
				return false;
			}
		}
		
		setores.add(novoSetor);

		return true;
	}

	public static ArrayList<Setor> retornarListaSetores() {
		return setores;
	}

	public static Integer GerarCodSetor() {
		return id++;
	}

	/**
	 * Classe que busca o setor no ArrayList com base no código de setor, inserido pelo usuário. Não implementado na versão final do código.
	 * @param codigoSetor.
	 * @return O setor encontrado na lista.
	 */
	public static Setor retornarSetor(Integer codigoSetor) {

		Setor setorEncontrado = new Setor();
		
		for(Setor setorCadastrado : setores) {
			if(setorCadastrado.getCodigoSetor().equals(codigoSetor)) {
				setorEncontrado = setorCadastrado;
				break;
			}
		}
		
		return setorEncontrado;
	}
}