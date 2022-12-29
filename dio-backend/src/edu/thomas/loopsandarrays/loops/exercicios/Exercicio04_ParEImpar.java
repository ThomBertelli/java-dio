package edu.thomas.loopsandarrays.loops.exercicios;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Exercicio04_ParEImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int quantidadeNumeros = 0;
		int quantidadePares = 0;
		int quantidadeImpares = 0;
		int count = 0;
		
		System.out.println("Quantos números deseja informar?");
		quantidadeNumeros = scanner.nextInt();
		
		do {
			System.out.println("Informe um número:");
			int numero = scanner.nextInt();
			if(numero % 2 == 0) quantidadePares++;
			else quantidadeImpares++;
			count++;
			
		} while (count < quantidadeNumeros);
		
		System.out.println("Quantidadede de números pares: " + quantidadePares);
		System.out.println("Quantidadede de números impares: " + quantidadeImpares);

	}

}
