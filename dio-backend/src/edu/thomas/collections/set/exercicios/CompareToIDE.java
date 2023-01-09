package edu.thomas.collections.set.exercicios;

import java.util.Comparator;

public class CompareToIDE implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int ide = l1.getIde().compareTo(l2.getIde());		
		if(ide != 0) return ide;
		return Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao()); 
		
	}

}
