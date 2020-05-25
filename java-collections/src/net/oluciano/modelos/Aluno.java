package net.oluciano.modelos;

public class Aluno extends Pessoa implements Comparable<Aluno>{

	/**
	 * http://luizricardo.org/2014/10/nuances-sobre-serializacao-de-objetos-com-heranca-em-java/
	 */
	private static final long serialVersionUID = 1L;
	private String curso;	
	
	public Aluno(String nome, String sobrenome, int idade, double altura, String curso) {
		super(nome, sobrenome, idade, altura);
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + ", Curso: " + curso;
	}

	@Override
	public int compareTo(Aluno aluno) {
		return super.getNomeCompleto().compareTo(aluno.getNomeCompleto());
	}
}
