package funcionario;

public class Supervisor extends Funcionario implements Autenticavel{

	private int senha;

	public Supervisor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.1;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}

	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;
	}	
}
