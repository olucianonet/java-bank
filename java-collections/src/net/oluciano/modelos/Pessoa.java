package net.oluciano.modelos;

import java.io.Serializable;

public class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;
	private int idade;
	private double altura;

	public Pessoa(String nome, String sobrenome, int idade, double altura) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s, Sobrenome: %s, Idade: %d, Altura: %.2f", 
				nome, sobrenome, idade, altura);
	}

	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public String getNomeCompleto() {
		return this.getNome().concat(" ").concat(this.getSobrenome());
	}
	
	public int getIdade(){
		return this.idade;
	}
}
