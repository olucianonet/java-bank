package net.oluciano.modelos;

public class Pessoa {

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
		return String.format("Nome: %s,%nSobrenome: %s,%nIdade: %d,%nAltura: %.2f", 
				nome, sobrenome, idade, altura);
	}

}
