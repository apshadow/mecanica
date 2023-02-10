package br.com.fiap.shift.mecanica.model;

public class StockCar extends Carro {

	private String tipoCarroceria;

	public String getIntCarroceria() {
		return tipoCarroceria;
	}

	public void setIntCarroceria(String intCarroceria) {
		this.tipoCarroceria = intCarroceria;
	}

	@Override
	public String toString() {
		return "StockCar [tipoCarroceria=" + tipoCarroceria + ", " + super.toString() + "]";
	}

}
