package edu.thomas.collections.map.exercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercicio01 {
	
	
	public static void main(String[] args) {
		
		/*
		 * Dada a população estimada de alguns estados do NE brasileiro, faça:
		 * 
		 * Estado = PE - População = 9.616.621
		 * 
		 * Estado = AL - População = 3.351.543
		 * 
		 * Estado = CE - População = 9.187.103
		 * 
		 * Estado = RN - População = 3.534.265
		 * 
		 * Crie um dicionário e relacione os estados e suas populações;
		 */
		Map<String, Integer> estadosPopulacao = new HashMap<>();
		
		estadosPopulacao.put("PE", 9616621);
		estadosPopulacao.put("AL", 3351543);
		estadosPopulacao.put("CE", 9187103);
		estadosPopulacao.put("RN", 3534265);
		
		//Substitua a população do estado do RN por 3.534.165;
		estadosPopulacao.put("RN",3534165);
		
		/*
		 * Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
		 */
		if(!estadosPopulacao.containsKey("PB")) {
			estadosPopulacao.put("PB", 4039277);
			System.out.println(estadosPopulacao);
		}else{
			System.out.println("PB está no dicionário.");			
		}
		
		//Exiba a população PE;
		System.out.println(estadosPopulacao.get("PE"));
		
		/*
		 * Exiba todos os estados e suas populações na ordem que foi informado;
		 */
		Map<String, Integer> estadosPopulacao2 = new LinkedHashMap<>(estadosPopulacao);
		System.out.println(estadosPopulacao2);
		
		//Exiba os estados e suas populações em ordem alfabética;
		Map<String,Integer> estadosPopulacao3 = new TreeMap<>(estadosPopulacao2);
		System.out.println(estadosPopulacao3);
		
		//Exiba o estado com o menor população e sua quantidade;
		Integer menorPopulacao = 99999999;
		String  menorEstado = "";
		
		for(Map.Entry<String, Integer> estado:estadosPopulacao.entrySet()) {
						
			if(estado.getValue() < menorPopulacao) {
				menorPopulacao = estado.getValue();
				menorEstado = estado.getKey();}
			
		}
		
		System.out.println("O estado com a menor população é " + menorEstado + " com " + menorPopulacao + " de habitantes.");
		
		//Exiba o estado com a maior população e sua quantidade;
		Integer maiorPopulacao = -99999999;
		String  maiorEstado = "";
		
		for(Map.Entry<String, Integer> estado:estadosPopulacao.entrySet()) {
						
			if(estado.getValue() > maiorPopulacao) {
				maiorPopulacao = estado.getValue();
				maiorEstado = estado.getKey();}
			
		}
		
		System.out.println("O estado com a maior população é " + maiorEstado + " com " + maiorPopulacao + " de habitantes.");
		
		//Exiba a soma da população desses estados;
		
		Integer soma = 0;
		
		
		for(Map.Entry<String, Integer> estado:estadosPopulacao.entrySet()) {
						
			soma += estado.getValue(); 
			
		}
		
		System.out.println("A soma das populações dos estados é " + soma) ;
		
			
		//Exiba a média da população deste dicionário de estados;	
		
		System.out.println("A média da população dos estados é " + soma/estadosPopulacao.size());
		
//		Remova os estados com a população menor que 4.000.000;
		
		Iterator<Integer> iterator = estadosPopulacao.values().iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next() < 4000000) iterator.remove();
		}		
		
		System.out.println(estadosPopulacao);
		
//		Apague o dicionário de estados;
		
		estadosPopulacao.clear();
		
//		Confira se o dicionário está vazio.
		
		System.out.println(estadosPopulacao.isEmpty());
		
	}
}
