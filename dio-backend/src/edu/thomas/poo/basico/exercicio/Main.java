package edu.thomas.poo.basico.exercicio;

public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Azul", "Sentra SL", 55);
		
		System.out.println("Para encher o tanque de um " + carro1.getModelo() + " será preciso gastar: R$ " + carro1.valorTotalTanque(6.45) );
		
		
		Carro carro2 = new Carro();
		
		carro2.setCor("Branco");
		carro2.setModelo("Gol G5");
		carro2.setCapacidadeTanque(45);
		
		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());
	}

}
