package edu.up.dsj.controller;

import java.util.ArrayList;

import edu.up.dsj.models.Pagamento;

public class PagamentoController {

	private static ArrayList<Pagamento> holerites = new ArrayList<Pagamento>();

	public static boolean gerarHolerite(Pagamento holerite) {

		String cpf = holerite.getFuncionario().getCpf();
		int ano = holerite.getAno();
		int mes = holerite.getMes();
		if(buscarFuncionarioMesAno(cpf, mes, ano) == null) {
			holerites.add(holerite);
			return true;
		}
		
		return false;
	}

	public static Pagamento buscarFuncionarioMesAno(String cpf, int mes, int ano) {

		for (Pagamento holeriteCadastrado : holerites) {
			if (holeriteCadastrado.getFuncionario().getCpf().equals(cpf) && holeriteCadastrado.getMes() == mes
					&& holeriteCadastrado.getAno() == ano) {
				return holeriteCadastrado;
			}
		}
		
		return null;
	}
	
	public static ArrayList<Pagamento> listarPorMesAno (int mes, int ano){
		ArrayList<Pagamento> holeritesFiltrados = new ArrayList<Pagamento>();
		
		for(Pagamento holeriteCadastrado : holerites) {
			if(holeriteCadastrado.getMes() == mes && holeriteCadastrado.getAno() == ano) {
				holeritesFiltrados.add(holeriteCadastrado);
			}
		}
		
		return holeritesFiltrados;
	}
	
	public static double calcularSalarioBruto(int horas, double valor) {
		return horas * valor;
	}

	public static double calcularFGTS(double bruto) {
		return bruto * .08;
	}

	public static double calcularINSS(double bruto) {
		if(bruto <= 1693.72) {
			return bruto *.08;
		}else if(bruto <= 2822.90) {
			return bruto *.09;
		}else if(bruto <= 5645.80) {
			return bruto * .11;
		}else {
			return 621.31;
		}
	}

	public static double calcularIR(double bruto) {
		if(bruto <= 1903.98) {
			return 0;
		}else if(bruto <= 2826.65) {
			return (bruto *.075) - 142.8;
		}else if(bruto <= 3751.05) {
			return (bruto * .15) - 354.80;
		}else if(bruto <= 4664.68){
			return (bruto * .225) - 636.13;
		}else {
			return (bruto * .275) - 869.36;
		}
	}
	
	public static double calcularSalarioLiquido(double bruto, double ir, double inss) {
		return bruto - ir - inss;
	}
	
}