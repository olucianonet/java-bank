package net.oluciano.modelos;

public class AlunoComposto extends Pessoa {

	private static final long serialVersionUID = 1L;
	private Curso curso;	
	
	public AlunoComposto(String nome, String sobrenome, int idade, double altura, Curso curso) {
		super(nome, sobrenome, idade, altura);
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + curso;
	}	
}
