package net.oluciano.modelos;

public class AlunoComCPF extends Aluno {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cpf;

	public AlunoComCPF(String nome, String sobrenome, int idade, double altura, String curso, String cpf) {
		super(nome, sobrenome, idade, altura, curso);
		this.cpf = cpf;
	}
	
	public AlunoComCPF(String nome, String sobrenome, int idade, String cpf, String curso) {
		super(nome, sobrenome, idade, 0, curso);
		
		if (nome == null){
			throw new NullPointerException();
		}
		
		this.cpf = cpf;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		AlunoComCPF other = (AlunoComCPF) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	private String getCPF() {
		return this.cpf;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s, CPF: %s, Curso: %s" , getNome(), getCPF(), getCurso());
	}
	

}
