package edu.thomas.collections.set.exercicios;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.midi.Soundbank;

/*Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:

Ordem de Inserção

Ordem Natural (nome)

IDE

Ano de criação e nome

Nome, ano de criacao e IDE

Ao final, exiba as linguagens no console, um abaixo da outra.*/


public class Exercicio02 {

	public static void main(String[] args) {
		
		Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>() {{
			add(new LinguagemFavorita("Java",1995 , "Eclipse"));
			add(new LinguagemFavorita("JavaScript",1995 , "VS Code"));
			add(new LinguagemFavorita("Python",1991 , "VS Code"));			
		}};		
		System.out.println(linguagensFavoritas);
		
		Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>();
		linguagemFavoritas2.addAll(linguagensFavoritas);
		System.out.println(linguagemFavoritas2);
		
		
		Set<LinguagemFavorita> linguagemFavoritas3 = new TreeSet<>(new CompareToIDE());
		linguagemFavoritas3.addAll(linguagensFavoritas);
		System.out.println(linguagemFavoritas3);
		
		Set<LinguagemFavorita> linguagemFavoritas4 = new TreeSet<>(new CompareToAnoENome());
		linguagemFavoritas4.addAll(linguagensFavoritas);
		System.out.println(linguagemFavoritas4);
		
		Set<LinguagemFavorita> linguagemFavoritas5 = new TreeSet<>(new CompareToNomeAnoCriacaoEIde());
		linguagemFavoritas5.addAll(linguagensFavoritas);
		System.out.println(linguagemFavoritas5);

	}

}
