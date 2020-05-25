package net.oluciano.modelos;

import java.io.Serializable;

public class Curso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private int duracao;

	public Curso(String nome, int duracao) {
		super();
		this.nome = nome;
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return String.format(",%nCurso: %s,%nDuração: %d.", 
				nome, duracao);
	}

}
