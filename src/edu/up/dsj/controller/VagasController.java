package edu.up.dsj.controller;

import java.util.ArrayList;
import edu.up.dsj.models.Vaga;

/**
 * Classe para controle de cadastros e manipulação de vagas. 
 * @author Cesar Augusto
 */
public class VagasController {

	private static ArrayList<Vaga> vagas = new ArrayList<Vaga>();

	public static int acharVaga(Integer codigoSetor) {
		for (int i = 0; i < vagas.size(); i++) {
			if (vagas.get(i).getSetor().getCodigoSetor().equals(codigoSetor)) {
				return i;
			}
		}
		return -1;
	}

	public static Vaga retornaVaga(int i) {
		return vagas.get(i);
	}

	public static void cadastrar(Vaga vaga) {
		vagas.add(vaga);
	}

	public static void preencherVaga(int i) {
		vagas.get(i).setVagasPreenchidas(vagas.get(i).getVagasPreenchidas() + 1);
	}

	public static void liberarVaga(int i) {
		vagas.get(i).setVagasPreenchidas(vagas.get(i).getVagasPreenchidas() - 1);
	}
}