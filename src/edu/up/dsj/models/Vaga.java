package edu.up.dsj.models;

public class Vaga {

	private Setor setor;
	private int totalDeVagas;
	private int vagasPreenchidas;
	private boolean vagas;

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public int getTotalDeVagas() {
		return totalDeVagas;
	}

	public void setTotalDeVagas(int totalDeVagas) {
		this.totalDeVagas = totalDeVagas;
	}

	public int getVagasPreenchidas() {
		return vagasPreenchidas;
	}

	public void setVagasPreenchidas(int vagasPreenchidas) {
		this.vagasPreenchidas = vagasPreenchidas;
	}

	public boolean isVagas() {
		return vagas;
	}

	public void setVagas(boolean vagas) {
		this.vagas = vagas;
	}

}
