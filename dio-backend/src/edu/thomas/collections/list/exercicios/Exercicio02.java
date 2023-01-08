package edu.thomas.collections.list.exercicios;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".*/



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
