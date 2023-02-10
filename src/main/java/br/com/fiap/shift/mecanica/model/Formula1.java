package br.com.fiap.shift.mecanica.model;

public class Formula1 extends Carro {

	private String esquipe;

	public String getEsquipe() {
		return esquipe;
	}

	public void setEsquipe(String esquipe) {
		this.esquipe = esquipe;
	}

	@Override
	public String toString() {
		return "Formula1 [esquipe=" + esquipe + ", " + super.toString() + "]";
	}

}
