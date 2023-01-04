package edu.thomas.poo.heranca.exercicio01;

public class Main {

	public static void main(String[] args) {
		
		Moto moto1 = new Moto("Honda", "CB500", 2020,"Vermelha", TiposCombustiveis.FLEX);
		
		
		System.out.println(moto1.getCombustivel());
		
	}

}
