package edu.thomas.collections.set.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*Crie um conjunto contendo as cores do arco-íris e:
Exiba todas as cores uma abaixo da outra
A quantidade de cores que o arco-íris tem
Exiba as cores em ordem alfabética
Exiba as cores na ordem inversa da que foi informada
Exiba todas as cores que começam com a letra ”v”
Remova todas as cores que não começam com a letra “v”
Limpe o conjunto
Confira se o conjunto está vazio*/


public class Exercicio01 {

	public static void main(String[] args) {
		
		
		Set<String> coresArcoIris = new HashSet<>();
		coresArcoIris.add("vermelho");
		coresArcoIris.add("laranja");
		coresArcoIris.add("amarelo");
		coresArcoIris.add("verde");
		coresArcoIris.add("azul");
		coresArcoIris.add("anil");
		coresArcoIris.add("violeta");
		
		
		for (String cor : coresArcoIris) {
			System.out.println(cor);
		}
		
		System.out.println(coresArcoIris.size());
		
		Set<String> coresArcoIris2 = new TreeSet<>();
		coresArcoIris2.addAll(coresArcoIris);
		System.out.println(coresArcoIris2);
		
		List<String> coresArcoIris3 = new ArrayList<>();
		coresArcoIris3.addAll(coresArcoIris);		
		System.out.println(coresArcoIris3);		
		Collections.reverse(coresArcoIris3);
		System.out.println(coresArcoIris3);
		
		for (String cor : coresArcoIris) {
			if(cor.startsWith("v")) System.out.println(cor);;
		}
		
		Iterator<String> iterador = coresArcoIris.iterator();		
		while (iterador.hasNext()) {
			String next = (String) iterador.next();
			if(!next.startsWith("v")) iterador.remove();
		}
		System.out.println(coresArcoIris);
		
		coresArcoIris.clear();
		
		System.out.println(coresArcoIris.isEmpty());
		
	}

}
