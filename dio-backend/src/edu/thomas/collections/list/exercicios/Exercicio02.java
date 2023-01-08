package edu.thomas.collections.list.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Exercicio02 {
	
	public static void main(String[] args) {
		
		
		List<String> perguntas = new ArrayList<>();
		
		perguntas.add("Telefonou para a vítima?");
		perguntas.add("Esteve no local do crime?");
		perguntas.add("Mora perto da vítima?");
		perguntas.add("Devia para a vítima?");
		perguntas.add("Já trabalhou com a vítima?");
		
		Iterator<String> iterator = perguntas.iterator();
		
		int contadorSim = 0;
		
		while(iterator.hasNext()){
			String next = iterator.next();
			Scanner scan = new Scanner(System.in);
			System.out.println(next);
			String resposta = scan.next();
			if(resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")) {
				contadorSim++;			
			}
		}

		if(contadorSim == 2) System.out.println("Suspeito");
		else if(contadorSim == 3 || contadorSim == 4) System.out.println("Cúmplice");
		else if(contadorSim == 5) System.out.println("Assassino");
		else System.out.println("Inocente");
		
	}
	
	
	
}
