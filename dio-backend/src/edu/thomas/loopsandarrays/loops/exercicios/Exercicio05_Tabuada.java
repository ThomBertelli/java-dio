package edu.thomas.loopsandarrays.loops.exercicios;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Exercicio05_Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		
		while (numero > 10 || numero < 1) {
			
			System.out.println("Digite o número que deseja saber a tabuada de 1 a 10: ");
			numero = scanner.nextInt();
		}
		
		
		
		for(int n = 1; n <= 10; n++) {
		
			System.out.println(numero + " X " + n + " = " + (numero * n));
			
		}

	}

}
