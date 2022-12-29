package edu.thomas.loopsandarrays.loops.exercicios;

import java.util.Scanner;

public class Exercicio06_Fatorial {

	/*
	Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
	Ex.: 5! = 120 (5 X 4 X 3 X 2 X 1)
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int fatorial = 1;
		
		System.out.println("Informe o número para saber seu fatorial: ");
		numero = scanner.nextInt();
		
		int count = numero;
		
		while (count > 1) {
			fatorial *= count;
			count--;			
		}
		
		System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
		
		
		
	}

}
