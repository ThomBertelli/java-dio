package edu.thomas.loopsandarrays.loops.exercicios;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Exercicio02_Nota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a nota de 0 a 10");
		int nota = scanner.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Informe a nota de 0 a 10");
			nota = scanner.nextInt();
		}
		
		

	}

}
