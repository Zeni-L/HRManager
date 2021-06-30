package edu.up.dsj.controller;

import java.util.ArrayList;
import edu.up.dsj.models.Setor;

/**
 * Classe para controle de cadastros de novos setores e manipula��o de ArrayList para o objeto Setor.
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

	public static Integer gerarCodSetor() {
		return id++;
	}

	/**
	 * Classe que busca o setor no ArrayList com base no c�digo de setor, inserido pelo usu�rio. N�o implementado na vers�o final do c�digo.
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

	public static boolean Deletar(Setor setor) {

		boolean deletado = false;

		for (Setor setorCadastrado : setores) {
			if (setorCadastrado.getCodigoSetor().equals(setorCadastrado.getCodigoSetor())) {
				setores.remove(setorCadastrado);
				deletado = true;
				break;
			}
		}
		return deletado;
	}

}