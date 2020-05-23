package net.oluciano.modelos;

// pela interface Comparable
public class Aluno implements Comparable<Aluno>{

	private int matricula;
	private String nome;
	private String cpf;
	private int idade;
	
	public Aluno(int matricula, String nome, String cpf, int idade) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public int getMatricula() {
		return this.matricula;
	}
	
	@Override
	public String toString() {
		return String.format("Matrícula: %d, Nome: %s, CPF: %s, Idade: %d", 
				matricula, nome, cpf, idade);
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Aluno aluno) {
		return this.getNome().compareTo(aluno.getNome());
	}

	public String getCPF() {
		return cpf;
	}
	
}
