package edu.thomas.collections.list.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercicio01 {

	public static void main(String[] args) {
	
		List <Integer> temperaturas = new ArrayList<>(Arrays.asList(32,28,27,22,20,38));
		
		Iterator<Integer> iterator = temperaturas.iterator();
		Integer soma = 0;
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			soma += next;
		}
		
		Integer media = soma/temperaturas.size();
		System.out.println("Média do semestre " + media +"Cº" );
		System.out.println("Meses com temperatura acima da média:");
		for (Integer temperatura : temperaturas) {
			if (temperatura > media) {
				
				switch (temperaturas.indexOf(temperatura)) {
				case 0:
					System.out.println("1 - Janeiro: " + temperatura +"Cº");
					break;
				case 1:
					System.out.println("2 - Fevereiro: "  + temperatura +"Cº");
					break;
				case 2:
					System.out.println("3 - Março: " + temperatura +"Cº");
					break;
				case 3:
					System.out.println("4 - Abril: " + temperatura +"Cº");
					break;
				case 4:
					System.out.println("5 - Maio: " + temperatura +"Cº");
					break;
				case 5:
					System.out.println("6 - Junho: " + temperatura +"Cº" );
					break;

				default:
					System.out.println("ERROR!");
					break;
				}
				
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
