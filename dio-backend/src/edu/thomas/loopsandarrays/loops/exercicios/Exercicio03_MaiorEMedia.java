package edu.thomas.loopsandarrays.loops.exercicios;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Exercicio03_MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int maior = 0;
		int soma = 0;
		int count = 0;
		
		do {
			System.out.println("Informe um o número " );
			int numero = scanner.nextInt();
			if(numero > maior) maior = numero;
			soma += numero;
			count++;
		} while (count < 5);
		
	
		System.out.println("O maior número informado é: " + maior);
		System.out.println("A média dos números informados é: " + (soma/5));
		

	}

}
