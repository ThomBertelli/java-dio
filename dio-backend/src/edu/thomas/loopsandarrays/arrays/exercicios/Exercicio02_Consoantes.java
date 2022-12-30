package edu.thomas.loopsandarrays.arrays.exercicios;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Exercicio02_Consoantes {
	
	public static void main(String[] args) {
	char[] vetor = {'a','b','c','d','e', 'f'};
	
	int quantidadeConsoantes = 0;
	
	for(char c : vetor) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			break;

		default:
			System.out.print(c + " ");
			quantidadeConsoantes++;
			break;
		}
	}
	System.out.println(quantidadeConsoantes);

	}

}
