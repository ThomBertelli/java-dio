package edu.thomas.poo.heranca.exercicio01;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int anoFabricao;
	private String cor;
	private TiposCombustiveis combustivel;
	
	public Veiculo(String marca, String modelo, int anoFabricao, String cor, TiposCombustiveis combustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricao = anoFabricao;
		this.cor = cor;
		this.combustivel = combustivel;
	}

	public Veiculo() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricao() {
		return anoFabricao;
	}

	public void setAnoFabricao(int anoFabricao) {
		this.anoFabricao = anoFabricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public TiposCombustiveis getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(TiposCombustiveis combustivel) {
		this.combustivel = combustivel;
	}
	
	
	
	

}
