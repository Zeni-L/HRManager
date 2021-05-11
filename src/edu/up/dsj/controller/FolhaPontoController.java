package edu.up.dsj.controller;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import edu.up.dsj.models.FolhaPonto;

//Classe para controle de cadastros e manipulação de livroPonto.
//@author Cesar Augusto


public class FolhaPontoController {

	private static ArrayList<FolhaPonto> livroPonto = new ArrayList<FolhaPonto>();
	
	public static Object[] verificaLivroPonto(FolhaPonto folha) {
		Object[] retorno = new Object[2];
		for (int i = 0; i < livroPonto.size(); i++) {
			if(livroPonto.get(i).getFuncionario().equals(folha.getFuncionario())
			&& livroPonto.get(i).getDiaDoPonto().compareTo(folha.getDiaDoPonto()) == 0
			&& livroPonto.get(i).getEntrada() != null) {
				if(livroPonto.get(i).getSaida() != null) {
					retorno[0] = 3;
					retorno[1] = i;
					return retorno;
				} else {
					retorno[0] = 2;
					retorno[1] = i;
					return retorno;
				}
			}
		}
		retorno[0] = 1;
		return retorno;
	}
	
	public static void pontoEntrada(FolhaPonto folha) {
		folha.setEntrada(LocalTime.now());
		livroPonto.add(folha);
	}
	
	public static void pontoSaida(int i) {
		livroPonto.get(i).setSaida(LocalTime.now());
	}
	
	public static FolhaPonto getFolha(int i) {
		return livroPonto.get(i);
	}
	
	public static Object[] calcularFolha(FolhaPonto folha) {
		Object[] retorno = new Object[3];
		int segundos =  (int) Duration.between(folha.getEntrada(), folha.getSaida()).toSeconds();
		int restoSegundos = segundos % 60;
		int minutos = segundos / 60;
		int restoMinutos = minutos % 60;
		int horas = minutos / 60;
		retorno[0] = horas;
		retorno[1] = restoMinutos;
		retorno[2] = restoSegundos;
		return retorno;
	}
	
}


















