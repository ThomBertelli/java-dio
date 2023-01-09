package edu.thomas.collections.set.exercicios;

import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	
	private String nome;
	private int anoDeCriacao;
	private String ide;
	
	public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeCriacao(int anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}


	@Override
	public int compareTo(LinguagemFavorita l1) {
		int nome = this.getNome().compareTo(l1.getNome());
		
		if(nome!=0) return nome;
		
		return Integer.compare(this.getAnoDeCriacao(), l1.getAnoDeCriacao());
		
	}

	@Override
	public String toString() {
		return "[ nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
	}
	
	
}
