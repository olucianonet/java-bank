package funcionario;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(String cpf, int senha) {
		return super.getCPF() == cpf && this.senha == senha;
	}

	@Override
	public double getBonificacao() {
		return (this.getSalario() * 0.1) + super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
}
