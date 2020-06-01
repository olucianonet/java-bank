package net.oluciano.modelos;

public class Aluno extends Pessoa implements Comparable<Aluno>
{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		return true;
	}

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
	
	public String getCurso() {
		return curso;
	}
	
}

