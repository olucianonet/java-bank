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
	
	@Override
	public boolean equals(Object obj) {
		
		return ((AlunoComCPF) obj).getCPF() == this.getCPF();		
	}

	private String getCPF() {
		return this.cpf;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s, CPF: %s" , getNome(), getCPF());
	}
	
	@Override
	public int hashCode() {	
		// Método utilizado por Set para
		// verificar repetições.
		return Integer.parseInt(getCPF());
	}
}
