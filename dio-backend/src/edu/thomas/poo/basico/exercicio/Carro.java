package edu.thomas.poo.basico.exercicio;

public class Carro {
	
	private String cor;
	private String modelo;
	private int capacidadeTanque;
	
	public Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public Carro() {
		
	}

	void setCor(String cor) {
		this.cor = cor;
	}
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	void setCapacidadeTanque( int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	String getCor() {
		return cor;
	}
	
	String getModelo() {
		return modelo;
	}
	
	int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	double valorTotalTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
	
	
	
}
