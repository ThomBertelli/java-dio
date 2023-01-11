package edu.thomas.collections.map.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Desafio {
	
	
	public static void main(String[] args) {
		
		/*
		 * Faça um programa que simule um lançamento de dados.
		 * 
		 * Lance o dado 100 vezes e armazene.
		 * 
		 * Depois, mostre quantas vezes cada valor foi inserido.
		 */
		
		
		List<Integer> resultados = new ArrayList<>();
		
		int umCount = 0;
		int doisCount = 0;
		int tresCount = 0;
		int quatroCount = 0;
		int cincoCount = 0;
		int seisCount = 0;
		int max = 6;
		int min = 1;
		
		
		for(int i = 0; i < 100; i++) {
			
			Integer resultado = (int)Math.floor(Math.random() * (max - min +1) + min);
			resultados.add(resultado);
		}
		
		Iterator<Integer> iterator = resultados.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			
			switch (next) {
			case 1:
				umCount++;
				break;
			case 2:
				doisCount++;
				break;
			case 3:
				tresCount++;
				break;
			case 4:
				quatroCount++;
				break;
			case 5:
				cincoCount++;
				break;
			case 6:
				seisCount++;
				break;
			default:
				System.out.println("Algo de errado não está certo! :(");
				break;
			}
			
			
		}
		
		System.out.println(resultados);
		
		System.out.println("O dado caiu " + umCount + " vezes no 1");
		System.out.println("O dado caiu " + doisCount + " vezes no 2");
		System.out.println("O dado caiu " + tresCount + " vezes no 3");
		System.out.println("O dado caiu " + quatroCount + " vezes no 4");
		System.out.println("O dado caiu " + cincoCount + " vezes no 5");
		System.out.println("O dado caiu " + seisCount + " vezes no 6");
		
	}
	
	
	

}
