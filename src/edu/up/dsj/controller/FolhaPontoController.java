package edu.up.dsj.controller;

import java.time.LocalTime;
import java.util.ArrayList;
import edu.up.dsj.models.FolhaPonto;

//Classe para controle de cadastros e manipulação de livroPonto.
//@author Cesar Augusto


public class FolhaPontoController {

	private static ArrayList<FolhaPonto> livroPonto = new ArrayList<FolhaPonto>();
	
	
	
	public static int BaterPonto(FolhaPonto folha) {
		for (int i = 0; i < livroPonto.size(); i++) {
			if(livroPonto.get(i).getFuncionario().equals(folha.getFuncionario())
			&& livroPonto.get(i).getDiaDoPonto().compareTo(folha.getDiaDoPonto()) == 0
			&& livroPonto.get(i).getEntrada() != null) {
				if(livroPonto.get(i).getSaida() != null) {
					return 3;		
				} else {
					livroPonto.get(i).setSaida(LocalTime.now());
					return 2;
				}
			}
		}
		folha.setEntrada(LocalTime.now());
		livroPonto.add(folha);
		System.out.println(folha.getDiaDoPonto());
		return 1;
	}
}